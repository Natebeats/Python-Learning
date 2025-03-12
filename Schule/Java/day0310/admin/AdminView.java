/*
 * Created by JFormDesigner on Mon Mar 10 07:24:51 CET 2025
 */

package day0310.admin;

import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author fred
 */
public class AdminView extends JFrame {
	public AdminView() {
		initComponents();
	}

	private void createUser(ActionEvent e) {
		if(!textField2.getText().isEmpty() && ! passwordField1.getText().isEmpty()) {
			User user = new User();
			user.setEmail(textField2.getText());
			user.setPasswort(passwordField1.getText());
			user.setName(textField3.getText());
			user.setNickname(textField4.getText());
			try {
				UserManagerREST.getInstance().createUser(user);
				User savedUser = UserManagerREST.getInstance().getUser(textField2.getText());
				textArea1.setText(savedUser.toString());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		textField2 = new JTextField();
		label2 = new JLabel();
		passwordField1 = new JPasswordField();
		label3 = new JLabel();
		textField3 = new JTextField();
		label4 = new JLabel();
		textField4 = new JTextField();
		button1 = new JButton();
		scrollPane1 = new JScrollPane();
		textArea1 = new JTextArea();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[grow,fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[grow]"));

		//---- label1 ----
		label1.setText("username");
		contentPane.add(label1, "cell 0 0");
		contentPane.add(textField2, "cell 1 0");

		//---- label2 ----
		label2.setText("passwort");
		contentPane.add(label2, "cell 0 1");
		contentPane.add(passwordField1, "cell 1 1");

		//---- label3 ----
		label3.setText("Name");
		contentPane.add(label3, "cell 0 2");
		contentPane.add(textField3, "cell 1 2");

		//---- label4 ----
		label4.setText("Nickname");
		contentPane.add(label4, "cell 0 3");
		contentPane.add(textField4, "cell 1 3");

		//---- button1 ----
		button1.setText("Create User");
		button1.addActionListener(e -> createUser(e));
		contentPane.add(button1, "cell 1 4");

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(textArea1);
		}
		contentPane.add(scrollPane1, "cell 0 5 2 1,growy");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JTextField textField2;
	private JLabel label2;
	private JPasswordField passwordField1;
	private JLabel label3;
	private JTextField textField3;
	private JLabel label4;
	private JTextField textField4;
	private JButton button1;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
