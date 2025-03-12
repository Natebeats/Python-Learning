package posts.post;

import posts.BaseController;
import posts.eventBus.EventBus;
import posts.eventBus.InterfaceCallback;
import posts.main.ControllerInterface;
import posts.messages.*;

import javax.swing.*;
import java.util.List;

public class PostController extends BaseController implements ControllerInterface, InterfaceCallback, InterfacePost {

        PostModel postModel;

        String loggedInUser;

    public PostController() {}

    @Override
    public void newTweet() {
        Tweet tweet = new Tweet();
        tweet.setEmail(loggedInUser);
        tweet.setContent(postModel.getText());
        EventBus.getInstance().sendMessage(new NewTweet(tweet));
        EventBus.getInstance().sendMessage(new RequestTweets(loggedInUser));
        postModel.setText("");
    }

    @Override
    public void init() {
        System.out.println("PostController initialized");
        view = new PostView(this);
        postModel = ((PostView) view).getObservableList1();
        EventBus.getInstance().registerListener(this);
        EventBus.getInstance().sendMessage(new RegisterView(view, "NewPost"));
    }

    @Override
    public void handleMessage(BaseMessage baseMessage) {
        switch(baseMessage.getMessageType()) {
            case "ReturnTweets":
                ReturnTweets returnTweets = (ReturnTweets) baseMessage;
                List<Tweet> tweets = (List<Tweet>) returnTweets.getMessageContent();
                try {
//                    List<String> tweetsAsString = new ArrayList<>();
                    ((PostView) view).getPanel1().removeAll();
                    for (Tweet tweet : tweets) {
                        boolean itsMe = loggedInUser.compareToIgnoreCase(tweet.getEmail()) == 0;
                        EinTweetController controller = new EinTweetController(tweet.getContent(), tweet.getEmail(), tweet.getTimestamp(), itsMe);

                        JPanel einTweet = controller.getView();
                        ((PostView) view).getPanel1().add(einTweet);
                    }
                    view.repaint();
                    view.revalidate();

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case "SuccessfulLogin":
                SuccessfulLogin successfulLogin = (SuccessfulLogin) baseMessage;
                loggedInUser = (String) successfulLogin.getMessageContent();
                break;
            case "ShowNewPage":
                ShowNewPage showNewPage = (ShowNewPage) baseMessage;
                String pageName = (String) showNewPage.getMessageContent();
                if (pageName.equals("NewPost")) {
                    EventBus.getInstance().sendMessage(new RequestTweets(loggedInUser));
                }
                break;
            case "TweetCreated":
                EventBus.getInstance().sendMessage(new RequestTweets(loggedInUser));
                break;

    }
}
}
