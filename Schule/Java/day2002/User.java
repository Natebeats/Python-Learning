/**
 * 
 */
package day2002;

import java.util.Objects;

/**
 * @author fred
 *
 */
public class User {
	
	String email;
	String name;
	String passwort;
	
	/**
	 * default Constructor
	 */
	public User() {
		
	}
	
	/**
	 * @param email
	 * @param name
	 * @param passwort
	 */
	public User(String email, String name, String passwort) {
		super();
		this.email = email;
		this.name = name;
		this.passwort = passwort;
	}
	
	public User(User user) {
		this.email = new String(user.getEmail());
		this.name = new String(user.getName());
		this.passwort = new String(user.getPasswort());
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", passwort=" + passwort + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, name, passwort);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(passwort, other.passwort);
	}

	
}
