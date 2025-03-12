/*
 * Created by JFormDesigner on Fri Mar 07 10:35:11 CET 2025
 */

package day0307.Tweets;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author fred
 */
public class TweetView extends JPanel {
	public TweetView() {
		initComponents();
	}

	public JPanel getPanel1() {
		return panel1;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		textField1 = new JTextField();
		button1 = new JButton();
		panel1 = new JPanel();

		//======== this ========
		setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[grow,fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("neu");
		add(label1, "cell 0 0");
		add(textField1, "cell 1 0");

		//---- button1 ----
		button1.setText("tweet");
		add(button1, "cell 2 0");

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
				"[grow]"));
		}
		add(panel1, "cell 0 1 3 2,grow");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JTextField textField1;
	private JButton button1;
	private JPanel panel1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
