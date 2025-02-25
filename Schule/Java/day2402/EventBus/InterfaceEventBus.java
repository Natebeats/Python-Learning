package day2402.EventBus;

import day2402.EventBus.messages.BaseMessage;

public interface InterfaceEventBus {

	void sendMessage(BaseMessage string);

	void registerListener(InterfaceCallback callback);

}
