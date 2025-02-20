/**
 * 
 */
package day0602.taschenrechner;

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
public class Taschenrechner extends JFrame implements ActionListener {

	JTextField anzeige;
	String merken = "";
	String operator = "";
	int merkzahl;
	String merkoperator;
	
	List<String> felder = new ArrayList<>(
			Arrays.asList("AC","","","/",
					      "7", "8","9","*",
					      "4", "5","6","-",
					      "1", "2","3","+",
					      "", "0","","=")
					      );

	public Taschenrechner() {


		setTitle("Taschenrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 4));

		for (String v : felder) {
			if (v.isEmpty()) {
				JLabel l = new JLabel();
				panel.add(l);
			} else {

				JButton button = new JButton(v);
				button.addActionListener(this);
				panel.add(button);
			}
		}

		anzeige = new JTextField();
		anzeige.setText("");
		anzeige.setEditable(false);

		JPanel gesamt = new JPanel();
		gesamt.setLayout(new BoxLayout(gesamt, BoxLayout.Y_AXIS));
		gesamt.add(anzeige);
		gesamt.add(panel);
		
		this.add(gesamt);

		pack();
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Taschenrechner myRevers = new Taschenrechner();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean zahl = false;
		boolean operation = false;
		String action = e.getActionCommand();
		switch (action) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			zahl = true;
			break;
		default:
			operation = true;
			break;
		}
		if(zahl) {
			doZahl(action);
		}
		if(operation) {
			doOperation(action);
		}
	}

	private void doOperation(String action) {
		switch(action) {
		case "+":
		case "-":
		case "/":
		case "*":
			merkzahl = Integer.valueOf(anzeige.getText());
			merkoperator = action;
			anzeige.setText("");
			break;
		case "=": 
			int erg = 0;
			int zweite = Integer.valueOf(anzeige.getText());
			switch(merkoperator) {
			case "+":
				erg = zweite + merkzahl;
				break;
			case "-":
				erg =  merkzahl - zweite ;
				break;
			case "/":
				erg =  merkzahl / zweite ;
				break;
			case "*":
				erg = zweite * merkzahl;
				break;
			
			}
			anzeige.setText(""+erg);
			merkzahl = erg;
			break;
		case "AC":
			anzeige.setText("");
			merkzahl = 0;
			merkoperator = "";
			break;
		}
		
	}

	private void doZahl(String action) {
		String textAnzeige = anzeige.getText();
		int wert = 0;
		int addWert = Integer.valueOf(action);
		if(!textAnzeige.isEmpty()) {
			wert = Integer.valueOf(textAnzeige);
		}
		wert = wert*10+addWert;
		anzeige.setText(""+wert);
		
	}

}
