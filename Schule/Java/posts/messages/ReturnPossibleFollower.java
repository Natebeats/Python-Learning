package posts.messages;

import java.util.List;

public class ReturnPossibleFollower extends BaseMessage{
    List<String> possibleFollower;

    public ReturnPossibleFollower(List<String> possibleFollower) {
        super("ReturnPossibleFollower");
        this.possibleFollower = possibleFollower;
    }

    @Override
    public Object getMessageContent() {
        return possibleFollower;
    }
}
