package day1802.menu;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HomeScreen extends JPanel {
	public HomeScreen() {
		setLayout(new BorderLayout());
		JLabel label = new JLabel("Willkommen auf der Startseite", SwingConstants.CENTER);
		add(label, BorderLayout.CENTER);
	}
}
