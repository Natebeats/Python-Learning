/**
 * 
 */
package day0502;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author fred
 *
 */
public class ContainerDemo extends JFrame {
	private static final long serialVersionUID = 1L;
	int zahl = 0;
	
	public ContainerDemo() {
		
		this.setTitle("TopLevelDemo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(300, 200));
		this.setBackground(Color.lightGray);
		// Menue-Leiste:
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(true);
		menuBar.setBackground(Color.green);
		menuBar.setPreferredSize(new Dimension(300, 20));
		menuBar.setToolTipText("Dies ist eine Menü-Leiste");
		// Panel (Bedienfeld):
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		panel.setPreferredSize(new Dimension(200, 90));

		JLabel textausgabe = new JLabel();
		textausgabe.setText("hier ist das ausgabefeld");
		
		// Schaltflächen
		JButton button1 = new JButton("setze auf 0");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				zahl = 0;
				textausgabe.setText(""+zahl);
				
			}
		});
		
		JButton button2 = new JButton("Addiere 1");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				zahl++;
				textausgabe.setText(""+zahl);
				
			}
		});
		JButton button3 = new JButton("Subtrahiere 1");
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				zahl--;
				textausgabe.setText(""+zahl);
				
			}
		});
//		JButton button4 = new JButton("Button 4");
		
		
		// Panel zusammenbauen:
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		// Hauptfenster zusammenbauen:
		this.setJMenuBar(menuBar);
		this.setLayout(new FlowLayout());
		this.add(panel);
		this.add(textausgabe);
		// Hauptfenster ausgeben:
		this.pack();
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		JFrame myApp = new ContainerDemo();
	}

}
