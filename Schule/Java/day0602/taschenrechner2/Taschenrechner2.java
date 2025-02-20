/**
 * 
 */
package day0602.taschenrechner2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

/**
 * @author fred
 *
 */
public class Taschenrechner2 extends JFrame implements ICallbackTaschenrechner {

	TaschenrecherAnzeige anzeige;
	String merken = "";
	String operator = "";
	int merkzahl;
	String merkoperator;
	TaschenrechnerRechenwerk rechenwerk;

	public Taschenrechner2() {

		rechenwerk = new TaschenrechnerRechenwerk();

		setTitle("Taschenrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel tastatur = new JPanel();

		tastatur = new TaschenrechnerTastatur(this);

		anzeige = new TaschenrecherAnzeige();

		JPanel gesamt = new JPanel();
		gesamt.setLayout(new BoxLayout(gesamt, BoxLayout.Y_AXIS));
		gesamt.add(anzeige);
		gesamt.add(tastatur);

		this.add(gesamt);

		pack();
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Taschenrechner2 taschenrechner = new Taschenrechner2();

	}


	@Override
	public void doOperation(String action) {
		try {
			switch (action) {
			case "+":
			case "-":
			case "/":
			case "*":
				String neueAnzeige = rechenwerk.eingabeZahl(anzeige.getText());
				rechenwerk.eingabeOperator(action);
				anzeige.setText(neueAnzeige);
				break;
			case "=":
				String neueAnzeigeBeiGleich = rechenwerk.eingabeZahl(anzeige.getText());
				anzeige.setText(neueAnzeigeBeiGleich);
				break;
			case "AC":
				anzeige.setText("");
				merkzahl = 0;
				merkoperator = "";
				break;
			}
		} catch (TaschenrechnerException exeption) {
			anzeige.errorAnzeigen();
		}

	}

	@Override
	public  void doZahl(String action) {
		String textAnzeige = anzeige.getText();
		int wert = 0;
		int addWert = Integer.valueOf(action);
		if (!textAnzeige.isEmpty()) {
			wert = Integer.valueOf(textAnzeige);
		}
		wert = wert * 10 + addWert;
		anzeige.setText("" + wert);

	}

}
