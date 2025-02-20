/*
 * Created by JFormDesigner on Mon Feb 10 10:30:18 CET 2025
 */

package day1002.jformdesigner2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.observablecollections.*;

/**
 * @author fred
 */
public class HelloWorldJForm extends JFrame {
	public HelloWorldJForm() {
		initComponents();
	}

	public HelloWorldModel getObservableList1() {
		return observableList1;
	}

	private void addiere(ActionEvent e) {
		HelloWorldModel model = getObservableList1();
		int iwert1 = Integer.parseInt(model.getWert1());
		int iwert2 = Integer.parseInt(model.getWert2());
		int summe = iwert1+iwert2;
		model.setErgebnis(""+summe);
		
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		label2 = new JLabel();
		inputFeld1 = new JTextField();
		label3 = new JLabel();
		inputFeld2 = new JTextField();
		button1 = new JButton();
		ergebnis = new JTextField();
		observableList1 = new HelloWorldModel();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[grow,fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("Hello World");
		label1.setFont(new Font("Helvetica Neue", Font.PLAIN, 22));
		contentPane.add(label1, "cell 1 0 2 1");

		//---- label2 ----
		label2.setText("Wert 1");
		contentPane.add(label2, "cell 1 1");
		contentPane.add(inputFeld1, "cell 2 1");

		//---- label3 ----
		label3.setText("Wert 2");
		contentPane.add(label3, "cell 1 2");
		contentPane.add(inputFeld2, "cell 2 2");

		//---- button1 ----
		button1.setText("Berechne");
		button1.addActionListener(e -> addiere(e));
		contentPane.add(button1, "cell 1 3");

		//---- ergebnis ----
		ergebnis.setEditable(false);
		contentPane.add(ergebnis, "cell 2 3");
		pack();
		setLocationRelativeTo(getOwner());

		//---- bindings ----
		bindingGroup = new BindingGroup();
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("helloWorldText"),
			label1, BeanProperty.create("text")));
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("wert1"),
			inputFeld1, BeanProperty.create("text")));
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("wert2"),
			inputFeld2, BeanProperty.create("text")));
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("ergebnis"),
			ergebnis, BeanProperty.create("text")));
		bindingGroup.bind();
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JLabel label2;
	private JTextField inputFeld1;
	private JLabel label3;
	private JTextField inputFeld2;
	private JButton button1;
	private JTextField ergebnis;
	private HelloWorldModel observableList1;
	private BindingGroup bindingGroup;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
