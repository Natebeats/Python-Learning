/*
 * Created by JFormDesigner on Tue Feb 18 10:16:56 CET 2025
 */

package day1802.menu;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author fred
 */
public class LoginScreenView extends JPanel {
	public LoginScreenView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		passwordField1 = new JPasswordField();
		button1 = new JButton();

		//======== this ========
		setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[120:n,fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("Email");
		add(label1, "cell 0 1");
		add(textField1, "cell 1 1");

		//---- label2 ----
		label2.setText("Passwort");
		add(label2, "cell 0 2");
		add(passwordField1, "cell 1 2");

		//---- button1 ----
		button1.setText("Login");
		add(button1, "cell 0 3 2 1");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JPasswordField passwordField1;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
