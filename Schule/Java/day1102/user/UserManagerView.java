/*
 * Created by JFormDesigner on Tue Feb 11 12:34:58 CET 2025
 */

package day1102.user;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import net.miginfocom.swing.*;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.observablecollections.*;
import org.jdesktop.swingbinding.*;

/**
 * @author fred
 */
public class UserManagerView extends JFrame {
	
	InterfaceUserManager interfaceUserManager;
	
	public void setInterfaceUserManager(InterfaceUserManager interfaceUserManager) {
		this.interfaceUserManager = interfaceUserManager;
	}
	
	public UserManagerView() {
		initComponents();
	}

	public JTextField getTextField1() {
		return textField1;
	}

	private void createUser(ActionEvent e) {
		interfaceUserManager.createUser();
	}

	public UserModel getObservableList1() {
		return observableList1;
	}

	private void findByMail(ActionEvent e) {
		interfaceUserManager.readUser();
	}

	public JTextField getTextField2() {
		return textField2;
	}

	public JPasswordField getPasswordField1() {
		return passwordField1;
	}

	public UserSelectionModel getObservableList2() {
		return observableList2;
	}

	private void list1ValueChanged(ListSelectionEvent e) {
		interfaceUserManager.findSelectedUser();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		label3 = new JLabel();
		passwordField1 = new JPasswordField();
		button1 = new JButton();
		label5 = new JLabel();
		button2 = new JButton();
		scrollPane1 = new JScrollPane();
		list1 = new JList();
		comboBox1 = new JComboBox();
		button3 = new JButton();
		button4 = new JButton();
		label4 = new JLabel();
		observableList1 = new UserModel();
		observableList2 = new UserSelectionModel();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[300:300,fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("Emai Adresse");
		contentPane.add(label1, "cell 0 0");
		contentPane.add(textField1, "cell 1 0");

		//---- label2 ----
		label2.setText("Nickname");
		contentPane.add(label2, "cell 0 1");
		contentPane.add(textField2, "cell 1 1");

		//---- label3 ----
		label3.setText("passwort");
		contentPane.add(label3, "cell 0 2");
		contentPane.add(passwordField1, "cell 1 2");

		//---- button1 ----
		button1.setText("create User");
		button1.addActionListener(e -> createUser(e));
		contentPane.add(button1, "cell 0 3");

		//---- label5 ----
		label5.setText("Benutzerliste");
		contentPane.add(label5, "cell 2 3");

		//---- button2 ----
		button2.setText("Fund User by Email");
		button2.addActionListener(e -> findByMail(e));
		contentPane.add(button2, "cell 0 4");

		//======== scrollPane1 ========
		{

			//---- list1 ----
			list1.addListSelectionListener(e -> list1ValueChanged(e));
			scrollPane1.setViewportView(list1);
		}
		contentPane.add(scrollPane1, "cell 2 4 1 4");
		contentPane.add(comboBox1, "cell 3 4");

		//---- button3 ----
		button3.setText("Update User");
		contentPane.add(button3, "cell 0 5");

		//---- button4 ----
		button4.setText("Delete user");
		contentPane.add(button4, "cell 0 6");

		//---- label4 ----
		label4.setText("status Info");
		contentPane.add(label4, "cell 0 7");
		pack();
		setLocationRelativeTo(getOwner());

		//---- bindings ----
		bindingGroup = new BindingGroup();
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("email"),
			textField1, BeanProperty.create("text")));
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("nickname"),
			textField2, BeanProperty.create("text")));
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("password"),
			passwordField1, BeanProperty.create("text")));
		bindingGroup.addBinding(SwingBindings.createJListBinding(UpdateStrategy.READ_WRITE,
			observableList2, (BeanProperty) BeanProperty.create("allEMails"), list1));
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList2, BeanProperty.create("selectedEmail"),
			list1, BeanProperty.create("selectedElement")));
		bindingGroup.addBinding(SwingBindings.createJComboBoxBinding(UpdateStrategy.READ_WRITE,
			observableList2, (BeanProperty) BeanProperty.create("allEMails"), comboBox1));
		bindingGroup.bind();
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JLabel label3;
	private JPasswordField passwordField1;
	private JButton button1;
	private JLabel label5;
	private JButton button2;
	private JScrollPane scrollPane1;
	private JList list1;
	private JComboBox comboBox1;
	private JButton button3;
	private JButton button4;
	private JLabel label4;
	private UserModel observableList1;
	private UserSelectionModel observableList2;
	private BindingGroup bindingGroup;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
