/*
 * Created by JFormDesigner on Fri Feb 28 10:55:12 CET 2025
 */

package day2802.tweets;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author fred
 */
public class TewwtView extends JFrame {
	public TewwtView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		textField1 = new JTextField();
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
			"[grow]"));
		contentPane.add(textField1, "cell 0 0 2 1");

		//---- button1 ----
		button1.setText("tweet");
		contentPane.add(button1, "cell 0 1");

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(textArea1);
		}
		contentPane.add(scrollPane1, "cell 0 2 2 1,growy");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JTextField textField1;
	private JButton button1;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
