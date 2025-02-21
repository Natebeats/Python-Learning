package day2102.eventbus;

public interface InterfaceEventBus {

	void sendMessage(String string);

	void registerListener(InterfaceCallback callback);

}
