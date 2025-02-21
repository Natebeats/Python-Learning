/*
 * Created by JFormDesigner on Thu Feb 20 15:13:44 CET 2025
 */

package day2102.menu;

import javax.swing.*;
import net.miginfocom.swing.*;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

/**
 * @author fred
 */
public class MenuView extends JFrame {
	public MenuView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		menuItem2 = new JMenuItem();
		observableList1 = new MenuModel();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]"));

		//======== menuBar1 ========
		{

			//======== menu1 ========
			{
				menu1.setText("Benutzer");

				//---- menuItem1 ----
				menuItem1.setText("login");
				menu1.add(menuItem1);

				//---- menuItem2 ----
				menuItem2.setText("logout");
				menu1.add(menuItem2);
			}
			menuBar1.add(menu1);
		}
		setJMenuBar(menuBar1);
		pack();
		setLocationRelativeTo(getOwner());

		//---- bindings ----
		bindingGroup = new BindingGroup();
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			observableList1, BeanProperty.create("menueVisible"),
			menu1, BeanProperty.create("visible")));
		bindingGroup.bind();
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem1;
	private JMenuItem menuItem2;
	private MenuModel observableList1;
	private BindingGroup bindingGroup;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
