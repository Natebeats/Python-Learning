/*
 * Created by JFormDesigner on Fri Mar 07 10:39:57 CET 2025
 */

package day0307.Tweets;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

/**
 * @author fred
 */
public class EinTweet extends JPanel {
	public EinTweet() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		label3 = new JLabel();
		label2 = new JLabel();

		//======== this ========
		setBorder(new TitledBorder("text"));
		setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[grow,fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("belibiegten Text");
		label1.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
		add(label1, "cell 0 0 2 1");

		//---- label3 ----
		label3.setText("text");
		label3.setFont(new Font("Helvetica Neue", Font.PLAIN, 8));
		add(label3, "cell 0 1 2 1,alignx right,growx 0");

		//---- label2 ----
		label2.setText("Datum");
		label2.setFont(new Font("Helvetica Neue", Font.PLAIN, 8));
		add(label2, "cell 2 1");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JLabel label3;
	private JLabel label2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
