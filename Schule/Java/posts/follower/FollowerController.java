package posts.follower;

import posts.BaseController;
import posts.Follow;
import posts.eventBus.EventBus;
import posts.eventBus.InterfaceCallback;
import posts.main.ControllerInterface;
import posts.messages.*;

import java.util.List;

public class FollowerController extends BaseController implements ControllerInterface, InterfaceCallback {

    FollowerModel followerModel;
    String loggedInUser;

    @Override
    public void handleMessage(BaseMessage baseMessage) {
        switch (baseMessage.getMessageType()) {
            case "SuccessfulLogin":
                SuccessfulLogin successfulLogin = (SuccessfulLogin) baseMessage;
                loggedInUser = (String) successfulLogin.getMessageContent();
                break;
            case "ReturnFollower":
                ReturnFollower returnFollower = (ReturnFollower) baseMessage;
                List<String> followerList = (List<String>) returnFollower.getMessageContent();
                followerModel.setFollower(followerList);
                break;
            case "ReturnFollowing":
                ReturnFollowing returnFollowing = (ReturnFollowing) baseMessage;
                List<String> followingList = (List<String>) returnFollowing.getMessageContent();
                followerModel.setFollowing(followingList);
                break;
            case "ReturnPossibleFollower":
                ReturnPossibleFollower returnPossibleFollower = (ReturnPossibleFollower) baseMessage;
                List<String> possibleFollowerList = (List<String>) returnPossibleFollower.getMessageContent();
                followerModel.setUserToFollow(possibleFollowerList);
                break;
            case "FollowerAdded":
                EventBus.getInstance().sendMessage(new RequestFollower(loggedInUser));
                EventBus.getInstance().sendMessage(new RequestFollowing(loggedInUser));
                EventBus.getInstance().sendMessage(new RequestPossibleFollower(loggedInUser));
                break;
        }
    }

    @Override
    public void init() {
        System.out.println("FollowerController initialized");
        view = new FollowerView(this);
        followerModel = ((FollowerView) view).getObservableList1();
        EventBus.getInstance().registerListener(this);
        EventBus.getInstance().sendMessage(new RegisterView(view, "Follower"));
    }

    public void followNow() {
        Follow follow = new Follow(loggedInUser,followerModel.getSelectedUserToFollow());
        EventBus.getInstance().sendMessage(new AddFollow(follow));
    }
}
