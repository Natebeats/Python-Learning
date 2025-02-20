/**
 * 
 */
package day0502;


import javax.swing.*;

/**
 * @author fred
 *
 */
public class HelloWorldSwing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello World Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
 
		JLabel label = new JLabel(" bitte passwort eingeben " );
		frame.add(label);
		

		frame.pack();
		frame.setVisible(true);
		
	}

}
