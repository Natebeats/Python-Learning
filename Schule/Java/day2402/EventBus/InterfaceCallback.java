package day2402.EventBus;

import day2402.EventBus.messages.BaseMessage;

public interface InterfaceCallback {
	public void handleMessage(BaseMessage s);
}
