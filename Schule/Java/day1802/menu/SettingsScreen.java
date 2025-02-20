package day1802.menu;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class SettingsScreen extends JPanel {
    public SettingsScreen() {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Einstellungen", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
    }
}