/**
 * 
 */
package day2402.EventBus.messages;

/**
 * @author fred
 *
 */
public abstract class BaseMessage {
	final String messageType;
	
	public BaseMessage(String messageType){
		this.messageType = messageType;
	}
	
	public String getMessageType() {
		return messageType;
	}

	abstract public Object getMessageContent();

}
