package day1102.user;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Objects;

public class UserModel {
	

    private final PropertyChangeSupport support;


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }


	
	
	private String nickname;
	private String email;
	private String password; // Achtung: Klartextspeicherung ist unsicher!

	
	
	public UserModel() {
		super();
		support = new PropertyChangeSupport(this);
	}

	public UserModel(String nickname, String email, String password) {
		super();
		support = new PropertyChangeSupport(this);
		this.nickname = nickname;
		this.email = email;
		this.password = password;
	}

	public UserModel(UserModel user) {
		super();
		support = new PropertyChangeSupport(this);
		this.nickname = new String(user.nickname);
		this.password = new String(user.password);
		this.email = new String(user.email);
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		String old = this.nickname;
		this.nickname = nickname;
		support.firePropertyChange("nickname", old, this.nickname);
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		String old = this.email;
		this.email = email;
		support.firePropertyChange("email", old, this.email);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		String old = this.password;
		this.password = password;
		support.firePropertyChange("password", old, this.password);
	}

	@Override
	public String toString() {
		return "UserModel{" + "nickname='" + nickname + '\'' + ", email='" + email + '\'' + ", password='" + password + '\''
				+ '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nickname, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		return Objects.equals(email, other.email) && Objects.equals(nickname, other.nickname)
				&& Objects.equals(password, other.password);
	}
	
}
