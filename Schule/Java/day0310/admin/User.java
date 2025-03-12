package day0310.admin;

public class User {
	private String email;
	private String nickname;
	private String passwort;
	private String name;

	public User() {
	};

	public User(User user) {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String password) {
		this.passwort = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", nickname=" + nickname + ", passwort=" + change(passwort) + ", name=" + name
				+ "]";
	}

	private String change(String passwort2) {
		if (passwort2 != null) {
			String s = "************************";
			return s.substring( Math.min(passwort2.length(), s.length()));
		}
		return "null";
	}

}