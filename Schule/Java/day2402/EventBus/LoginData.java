/**
 * 
 */
package day2402.EventBus;

/**
 * @author fred
 *
 */
public class LoginData {
	String email;
	String password;
	boolean loginOK;
	
	
	public LoginData(String email, String password, boolean loginOK) {
		super();
		this.email = email;
		this.password = password;
		this.loginOK = loginOK;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLoginOK() {
		return loginOK;
	}
	public void setLoginOK(boolean loginOK) {
		this.loginOK = loginOK;
	}
	
	
	
}
