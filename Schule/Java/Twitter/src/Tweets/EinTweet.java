/*
 * Created by JFormDesigner on Thu Mar 06 13:27:32 CET 2025
 */

package Tweets;

import javax.swing.*;
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
		setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[grow,fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("text");
		add(label1, "cell 0 0 3 1");

		//---- label3 ----
		label3.setText("Datum");
		add(label3, "cell 3 0");

		//---- label2 ----
		label2.setText("von");
		add(label2, "cell 2 1 2 1");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JLabel label3;
	private JLabel label2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
