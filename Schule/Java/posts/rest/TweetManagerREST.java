package posts.rest;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import posts.Constants;
import posts.eventBus.EventBus;
import posts.eventBus.InterfaceCallback;
import posts.main.ControllerInterface;
import posts.messages.*;
import posts.post.Tweet;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class TweetManagerREST implements InterfaceCallback, ControllerInterface {
    private final String baseUrl = Constants.BASE_URL + "api/tweets";
    private HttpClient httpClient;
    private Gson gson;

    public TweetManagerREST() {
    }


    public Tweet newTweet(Tweet tweet) throws Exception {
        String requestBody = gson.toJson(tweet);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl))
                .header("Authorization", HttpBasicAuthHelper.getHttpBasicAuthString())
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.statusCode() == 200 ? gson.fromJson(response.body(), Tweet.class) : null;
    }


    public List<Tweet> getTweets(String email) throws Exception {
        Type listType = new TypeToken<List<Tweet>>(){}.getType();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl+"/inclFollower/"+email))
                .header("Authorization", HttpBasicAuthHelper.getHttpBasicAuthString())
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.statusCode() == 200 ? gson.fromJson(response.body(), listType) : new ArrayList<>();
    }

    @Override
    public void handleMessage(BaseMessage baseMessage)  {
        switch(baseMessage.getMessageType()) {
            case "NewTweet":
                NewTweet requestUser = (NewTweet) baseMessage;
                Tweet tweet = (Tweet) requestUser.getMessageContent();
                try {
                    Tweet newTweet = this.newTweet(tweet);
                    EventBus.getInstance().sendMessage(new TweetCreated());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case "RequestTweets":
                RequestTweets requestTweets = (RequestTweets) baseMessage;
                String email = (String) requestTweets.getMessageContent();
                try {
                    List<Tweet> tweets = this.getTweets(email);
                    EventBus.getInstance().sendMessage(new ReturnTweets(tweets));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
           }
    }

    @Override
    public void init() {
        System.out.println("TweetManagerREST initialized");
        this.httpClient = HttpClient.newHttpClient();
        this.gson = new Gson();
        EventBus.getInstance().registerListener(this);
    }
}
