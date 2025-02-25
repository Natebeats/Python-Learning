package day2402.EventBus.messages;

public class TextMessage extends BaseMessage {

	private String text;

	public TextMessage(String text) {
		super("textMessage");
		this.text = text;
	}
	
	@Override
	public Object getMessageContent() {
		return text;
	}

	@Override
	public String toString() {
		return "TextMessage [text=" + text + ", messageType=" + messageType + "]";
	}

}
