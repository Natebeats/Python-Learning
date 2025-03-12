package posts.post;

import java.util.Date;
public class Tweet {

    private String email;
    private String content;
    private Date timestamp;

    @Override
    public String toString() {
        return "Tweet{" +
                "email='" + email + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
    
}
