/**
 * 
 */
package day2102.menu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import day1702.usermanager.UserManagerController;
import day1802.menu.HomeScreen;
import day2102.login.LoginView;

/**
 * @author fred
 *
 */
public class MenuController  {
	private JFrame frame; 
	private CardLayout cardLayout;
	private JPanel mainPanel;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MenuController userManagerController = new MenuController();
		SwingUtilities.invokeLater(() -> userManagerController.initView());
	}

	
	private void initView() {
		frame = new MenuView();
		frame.setTitle("Menü-Navigation");
		frame.setSize(600, 400);

		frame.setLocationRelativeTo(null);

		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);

		mainPanel.add(new LoginView(), "Login");

		frame.add(mainPanel);

		cardLayout.show(mainPanel, "Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public MenuController() {

	}

}
