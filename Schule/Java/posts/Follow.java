package posts;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@Getter
@Setter
public class Follow {
    private String loggedInUser;
    private String userToFollow;

    public Follow(String loggedInUser, String userToFollow) {
        this.loggedInUser = loggedInUser;
        this.userToFollow = userToFollow;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Follow follow = (Follow) o;
        return Objects.equals(loggedInUser, follow.loggedInUser) && Objects.equals(userToFollow, follow.userToFollow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loggedInUser, userToFollow);
    }
}
