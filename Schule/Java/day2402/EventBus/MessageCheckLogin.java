/**
 * 
 */
package day2402.EventBus;

import day2402.EventBus.messages.BaseMessage;

/**
 * @author fred
 *
 */
public class MessageCheckLogin extends BaseMessage{
	LoginData loginData;
	
	public MessageCheckLogin(LoginData loginData) {
		super("LoginData");
		this.loginData = loginData;
	}
	
	@Override
	public Object getMessageContent() {
		return loginData;
	}
	

}
