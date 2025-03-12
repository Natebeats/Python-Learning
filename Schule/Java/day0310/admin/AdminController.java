/**
 * 
 */
package day0310.admin;

import javax.swing.JFrame;


/**
 * @author fred
 *
 */
public class AdminController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AdminController adminController = new AdminController();
		adminController.init();

	}

	private void init() {
		AdminView view = new AdminView();
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setVisible(true);	
		
	}

}
