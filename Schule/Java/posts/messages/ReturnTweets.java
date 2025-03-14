package posts.messages;
import posts.post.Tweet;

import java.util.List;

public class ReturnTweets extends BaseMessage{
    List<Tweet> tweets;

    public ReturnTweets(List<Tweet> tweets) {
        super("ReturnTweets");
        this.tweets = tweets;
    }

    @Override
    public Object getMessageContent() {
        return tweets;
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        for(Tweet tweet : tweets) {
            res.append(tweet.toString()).append(" ");
        }
        return res.toString();
    }
}
