/**
 * 
 */
package day0502;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author fred
 *
 */
public class HelloWorldSwing2 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		JFrame myApp = new HelloWorldSwing2("Meine Ueberschrift", "mein JLABEL-Text");

	}

	public HelloWorldSwing2(String ueberschrift, String meinNeuerText) {
		this.setTitle(ueberschrift);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel(meinNeuerText);
		this.add(label);

		this.pack();
		this.setVisible(true);
	}

}
