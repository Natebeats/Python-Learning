package day2502.factory;

import day2402.EventBus.EventBus;
import day2402.EventBus.InterfaceCallback;
import day2402.EventBus.messages.BaseMessage;

/**
 * Controller für die Admin-Verwaltung.
 */
public class AdminController implements ControllerInterface , InterfaceCallback{
    @Override
    public void init() {
        System.out.println("⚙️ AdminController initialized!");
        EventBus.getInstance().registerListener(this);
    }

	@Override
	public void handleMessage(BaseMessage s) {
		// TODO Auto-generated method stub
		
	}
}