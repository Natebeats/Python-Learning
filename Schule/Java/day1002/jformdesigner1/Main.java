/**
 * 
 */
package day1002.jformdesigner1;

/**
 * @author fred
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainView view = new MainView();
		Model model = view.getObservableModel();
		
		model.setLabelText("so starte ich");
		java.awt.EventQueue.invokeLater(() -> view.setVisible(true));
		
		sleep(5);
		
		model.setLabelText("nach 5 sekunden");
		sleep(1);
		for(int i=6; i<20;i++) {
			model.setLabelText("nach " + i + " sekunden");
			sleep(1);
		}
	}

	private static void sleep(int sek) {
		try {
			Thread.sleep(sek*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
