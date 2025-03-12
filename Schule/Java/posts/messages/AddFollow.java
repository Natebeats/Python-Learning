package posts.messages;

import posts.Follow;

public class AddFollow extends BaseMessage{

    Follow follow;

    public AddFollow(Follow follow) {
        super("AddFollow");
        this.follow = follow;
    }

    @Override
    public Object getMessageContent() {
        return follow;
    }
}
