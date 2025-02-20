/**
 * 
 */
package day1002.jformdesigner2;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import day0602.taschenrechner2.TaschenrecherAnzeige;
import day0602.taschenrechner2.TaschenrechnerTastatur;

/**
 * @author fred
 *
 */
public class HelloWorldController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorldJForm view = new HelloWorldJForm();
		
		HelloWorldModel model = view.getObservableList1();
		
		model.setHelloWorldText("mein neuer Taschenrechner");

		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//		pack();
		view.setVisible(true);


	}

}
