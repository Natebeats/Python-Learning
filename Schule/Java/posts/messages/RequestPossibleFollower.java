package posts.messages;

public class RequestPossibleFollower extends BaseMessage{
    String email;

    public RequestPossibleFollower(String email) {
        super("RequestPossibleFollower");
        this.email = email;
    }

    @Override
    public Object getMessageContent() {
        return email;
    }
}
