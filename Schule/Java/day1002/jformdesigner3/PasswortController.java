/**
 * 
 */
package day1002.jformdesigner3;

import javax.swing.JFrame;

/**
 * @author fred
 *
 */
public class PasswortController implements IPasswortCheck {

	private  PasswortModel model;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PasswortController controller = new PasswortController();
	}

	public PasswortController() {
		PasswortView view = new PasswortView();
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		model = view.getObservableList1();
		view.setPasswortChecker(this);

		view.setVisible(true);
		
	}
	@Override
	public void check() {
		String inputEmail = model.getEmail();
		String inputPasswort = model.getPasswort();
		
		if(inputEmail.equals("fred@me.com") && inputPasswort.equals("passwort")) {
			model.setLoginStatus("OK");
		} else {
			model.setLoginStatus("NOK");
		}
	}

}
