/*
 * Created by JFormDesigner on Thu Feb 20 15:09:17 CET 2025
 */

package day2102.login;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author fred
 */
public class LoginView extends JPanel {
	public LoginView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		passwordField1 = new JPasswordField();

		//======== this ========
		setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[150:n,fill]",
			// rows
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("Email");
		add(label1, "cell 0 0");
		add(textField1, "cell 1 0");

		//---- label2 ----
		label2.setText("Passwort");
		add(label2, "cell 0 1");
		add(passwordField1, "cell 1 1");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JPasswordField passwordField1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
