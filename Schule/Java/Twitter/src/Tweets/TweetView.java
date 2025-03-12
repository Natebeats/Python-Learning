/*
 * Created by JFormDesigner on Thu Mar 06 13:25:36 CET 2025
 */

package Tweets;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author fred
 */
public class TweetView extends JFrame {
	public TweetView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		textField1 = new JTextField();
		button1 = new JButton();
		panel1 = new JPanel();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[grow,fill]" +
			"[center]",
			// rows
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("neuer Tweet");
		contentPane.add(label1, "cell 0 0");
		contentPane.add(textField1, "cell 1 0");

		//---- button1 ----
		button1.setText("OK");
		contentPane.add(button1, "cell 2 0");

		//======== panel1 ========
		{
			panel1.setLayout(new MigLayout(
				"hidemode 3",
				// columns
				"[fill]" +
				"[fill]",
				// rows
				"[]" +
				"[grow]" +
				"[]"));
		}
		contentPane.add(panel1, "cell 0 1 3 2");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JTextField textField1;
	private JButton button1;
	private JPanel panel1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
