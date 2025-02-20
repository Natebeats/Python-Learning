package day1802.menu;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class UserManagementScreen extends JPanel {
    public UserManagementScreen() {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Benutzerverwaltung", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
    }
}