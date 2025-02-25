package day2402.EventBus.messages;

public class SuccessfulLogin extends BaseMessage {

	private String email;

	public SuccessfulLogin(String email ) {
		super("SuccessfulLogin");
		this.email = email;
	}
	
	@Override
	public Object getMessageContent() {
		return email;
	}

	@Override
	public String toString() {
		return "SuccessfulLogin [email=" + email + ", messageType=" + messageType + "]";
	}

}
