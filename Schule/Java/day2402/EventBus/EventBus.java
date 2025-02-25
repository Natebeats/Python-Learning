package day2402.EventBus;

import java.util.ArrayList;
import java.util.List;

import day2402.EventBus.messages.BaseMessage;

public class EventBus implements InterfaceEventBus{

	
	private static EventBus eventBus;

	public static EventBus getInstance() {
		if(eventBus == null) {
			eventBus = new EventBus();
		}
		return eventBus;
	}
	
	private EventBus() {}

	private List<InterfaceCallback> callbacks = new ArrayList<>();

	public void sendMessage(BaseMessage message) {
		for(InterfaceCallback callback : callbacks) {
			callback.handleMessage(message);	
		}
	}

	@Override
	public void registerListener(InterfaceCallback  callback) {
		this.callbacks.add(callback);
		
	}

}
