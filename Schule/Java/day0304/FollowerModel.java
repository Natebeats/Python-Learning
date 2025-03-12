/**
 * 
 */
package day0304;

/**
 * @author fred
 *
 */
public class FollowerModel {
	String emailA;
	String emailB;   // emailA folgt emailB
	
	public String getEmailA() {
		return emailA;
	}
	public void setEmailA(String emailA) {
		this.emailA = emailA;
	}
	public String getEmailB() {
		return emailB;
	}
	public void setEmailB(String emailB) {
		this.emailB = emailB;
	}
	
	@Override
	public String toString() {
		return "FollowerModel [" + emailA + "folgt " + emailB + "]";
	}
	
	
	
}
