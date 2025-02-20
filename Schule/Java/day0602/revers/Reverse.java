/**
 * 
 */
package day0602.revers;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author fred
 *
 */
public class Reverse  extends JFrame 
	implements ActionListener {

	JTextField eingabe;
	JTextField ausgabe;
	
	public Reverse() {
		setTitle("Reverse / Textumkehrung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		
		JLabel texteingabe = new JLabel("bitte gib einen Text ein");
		panel.add(texteingabe);
		
		eingabe = new JTextField();
		panel.add(eingabe);
		
		JButton button = new JButton("drehe Text um");
		button.addActionListener(this);
		panel.add(button);
		
		ausgabe = new JTextField();
		ausgabe.setText("hier wird der Reverse Text angezeigt");
		ausgabe.setEditable(false);
		panel.add(ausgabe);
		
		
		this.add(panel);
		
		pack();
		setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Reverse myRevers = new Reverse();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String eigegebenerText = eingabe.getText();
		String text = new StringBuilder(eigegebenerText).reverse().toString();
		ausgabe.setText(text);
		
	}

}
