/*
 * Created by JFormDesigner on Fri Feb 07 11:48:58 CET 2025
 */

package day0602.taschenrechner3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author fred
 */
public class LoginView extends JDialog {
	public LoginView(Window owner) {
		super(owner);
		initComponents();
	}

	private void button1(ActionEvent e) {
		// TODO add your code here
	}

	private void button2(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		passwordField1 = new JPasswordField();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("Username");
		contentPane.add(label1, "cell 0 0");
		contentPane.add(textField1, "cell 1 0");

		//---- label2 ----
		label2.setText("Passwort");
		contentPane.add(label2, "cell 0 1");
		contentPane.add(passwordField1, "cell 1 1");

		//---- button1 ----
		button1.setText("Login");
		button1.addActionListener(e -> button1(e));
		contentPane.add(button1, "cell 1 2");

		//---- button2 ----
		button2.setText("Passwort vergessen");
		button2.addActionListener(e -> button2(e));
		contentPane.add(button2, "cell 1 3");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JPasswordField passwordField1;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
