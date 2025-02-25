package day2402.EventBus;

import day2402.EventBus.messages.BaseMessage;

public class ControllerMVC implements InterfaceCallback  {

	@Override
	public void handleMessage(BaseMessage s){
		switch(s.getMessageType()) {
		case "LoginSuccessful" : 
			// mach was
			break;
		case "Logout" : 
			// mach was
			break;
			default: 
				break;
		}
		
	}

	
}
