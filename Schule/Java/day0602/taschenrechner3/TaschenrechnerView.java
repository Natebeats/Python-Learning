/*
 * Created by JFormDesigner on Fri Feb 07 11:42:23 CET 2025
 */

package day0602.taschenrechner3;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author fred
 */
public class TaschenrechnerView extends JPanel {
	public TaschenrechnerView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		button1 = new JButton();
		textField3 = new JTextField();

		//======== this ========
		setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("Zahl1");
		add(label1, "cell 0 0");

		//---- textField1 ----
		textField1.setBackground(new Color(0x66ff00));
		add(textField1, "cell 1 0");

		//---- label2 ----
		label2.setText("text");
		add(label2, "cell 0 1");

		//---- textField2 ----
		textField2.setBackground(new Color(0x99ff99));
		add(textField2, "cell 1 1");

		//---- button1 ----
		button1.setText("Berechne");
		button1.setBackground(new Color(0xff0033));
		add(button1, "cell 1 2");

		//---- textField3 ----
		textField3.setEditable(false);
		add(textField3, "cell 2 2");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JButton button1;
	private JTextField textField3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
