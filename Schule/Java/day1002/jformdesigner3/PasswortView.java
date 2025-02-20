/*
 * Created by JFormDesigner on Tue Feb 11 09:02:07 CET 2025
 */

package day1002.jformdesigner3;

import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

/**
 * @author fred
 */
public class PasswortView extends JFrame {
	
	IPasswortCheck passwortChecker;
	
	public void setPasswortChecker(IPasswortCheck passwortChecker) {
		this.passwortChecker = passwortChecker;
	}

	public PasswortView() {
		initComponents();
	}
	
	private void button1(ActionEvent e) {
		passwortChecker.check();
		
	}

	public PasswortModel getObservableList1() {
		return observableList1;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		passwordField1 = new JPasswordField();
		button1 = new JButton();
		label3 = new JLabel();
		observableList1 = new PasswortModel();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[150:150,fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("Email");
		contentPane.add(label1, "cell 0 0");
		contentPane.add(textField1, "cell 1 0");

		//---- label2 ----
		label2.setText("Passwort");
		contentPane.add(label2, "cell 0 1");
		contentPane.add(passwordField1, "cell 1 1");

		//---- button1 ----
		button1.setText("Login");
		button1.addActionListener(e -> button1(e));
		contentPane.add(button1, "cell 0 2 2 1");

		//---- label3 ----
		label3.setText("text");
		contentPane.add(label3, "cell 0 3 2 1,alignx center,growx 0");
		pack();
		setLocationRelativeTo(getOwner());

		//---- bindings ----
		bindingGroup = new BindingGroup();
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("email"),
			textField1, BeanProperty.create("text")));
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("passwort"),
			passwordField1, BeanProperty.create("text")));
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("loginStatus"),
			label3, BeanProperty.create("text")));
		bindingGroup.bind();
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JPasswordField passwordField1;
	private JButton button1;
	private JLabel label3;
	private PasswortModel observableList1;
	private BindingGroup bindingGroup;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
