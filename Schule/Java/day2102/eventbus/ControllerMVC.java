package day2102.eventbus;

public class ControllerMVC implements InterfaceCallback  {

	@Override
	public void handleMessage(String s) {
		switch(s) {
		case "LoginSuccessful" : 
			// mach was
			break;
		case "Logout" : 
			// mach was
			break;
		}
		System.out.println(s);
		
	}
	
}
