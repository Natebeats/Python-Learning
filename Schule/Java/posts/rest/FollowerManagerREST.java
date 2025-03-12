package posts.rest;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import posts.BaseController;
import posts.Constants;
import posts.Follow;
import posts.eventBus.EventBus;
import posts.eventBus.InterfaceCallback;
import posts.main.ControllerInterface;
import posts.messages.*;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class FollowerManagerREST implements InterfaceCallback, ControllerInterface {
    private final String baseUrl = Constants.BASE_URL + "api/follower";
    private HttpClient httpClient;
    private Gson gson;

    public FollowerManagerREST() {
    }

    public Follow newFollower(Follow follow) throws Exception {
        String requestBody = gson.toJson(follow);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl))
                .header("Authorization", HttpBasicAuthHelper.getHttpBasicAuthString())
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.statusCode() == 200 ? gson.fromJson(response.body(), Follow.class) : null;
    }


    public List<String> getFollower(String email) throws Exception {
        return getListsFollower(email, "");
    }

    public List<String> getFollowing(String email) throws Exception {
        return getListsFollower(email, "followme/"); // TODO: followme in following umbenennen
    }

    public List<String> getPossibleFollower(String email) throws Exception {
        return getListsFollower(email, "getPossibleFollower/");
    }


    public List<String> getListsFollower(String email, String urlExtension) throws Exception {
        Type listType = new TypeToken<List<String>>(){}.getType();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl+"/" + urlExtension + email))
                .header("Authorization", HttpBasicAuthHelper.getHttpBasicAuthString())
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.statusCode() == 200 ? gson.fromJson(response.body(), listType) : new ArrayList<>();
    }


    @Override
    public void handleMessage(BaseMessage baseMessage)  {
        switch(baseMessage.getMessageType()) {
            case "AddFollow":
                AddFollow addFollow = (AddFollow) baseMessage;
                Follow follow = (Follow) addFollow.getMessageContent();
                try {
                    newFollower(follow);
                    EventBus.getInstance().sendMessage(new FollowerAdded());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case "RequestFollower":
                RequestFollower requestFollower = (RequestFollower) baseMessage;
                String emailFollower = (String) requestFollower.getMessageContent();
                try {
                    EventBus.getInstance().sendMessage(new ReturnFollower(getFollower(emailFollower)));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case "RequestFollowing":
                RequestFollowing requestFollowing = (RequestFollowing) baseMessage;
                String emailFollowing = (String) requestFollowing.getMessageContent();
                try {
                    EventBus.getInstance().sendMessage(new ReturnFollowing(getFollowing(emailFollowing)));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case "RequestPossibleFollower":
                RequestPossibleFollower requestPossibleFollower = (RequestPossibleFollower) baseMessage;
                String emailPossibleFollower = (String) requestPossibleFollower.getMessageContent();
                try {
                    EventBus.getInstance().sendMessage(new ReturnPossibleFollower(getPossibleFollower(emailPossibleFollower)));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
           }
    }

    @Override
    public void init() {
        System.out.println("FollowerManagerREST initialized");
        this.httpClient = HttpClient.newHttpClient();
        this.gson = new Gson();
        EventBus.getInstance().registerListener(this);
    }

}
