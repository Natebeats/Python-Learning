package day1802.menu;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
	private CardLayout cardLayout;
	private JPanel mainPanel;

	public MainFrame() {
		setTitle("Swing Menü-Navigation");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);

		mainPanel.add(new HomeScreen(), "Home");
		mainPanel.add(new SettingsScreen(), "Settings");
		mainPanel.add(new UserManagementScreen(), "UserManagement");
		mainPanel.add(new LoginScreenView(),"LoginScreen");
		
		setJMenuBar(createMenuBar());
		add(mainPanel);

		cardLayout.show(mainPanel, "LoginScreen");
	}

	private JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setVisible(false);
		JMenu menu = new JMenu("Navigation");

		JMenuItem homeItem = new JMenuItem("Home");
		JMenuItem settingsItem = new JMenuItem("Einstellungen");
		JMenuItem userItem = new JMenuItem("Benutzerverwaltung");
		JMenuItem loginScreen = new JMenuItem("Login");

		homeItem.addActionListener(e -> switchScreen("Home"));
		settingsItem.addActionListener(e -> switchScreen("Settings"));
		userItem.addActionListener(e -> switchScreen("UserManagement"));
		loginScreen.addActionListener(e -> switchScreen("LoginScreen"));

		menu.add(homeItem);
		menu.add(settingsItem);
		menu.add(userItem);
		menu.add(loginScreen);
		
		menuBar.add(menu);

		return menuBar;
	}

	public void switchScreen(String screenName) {
		cardLayout.show(mainPanel, screenName);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
	}
}