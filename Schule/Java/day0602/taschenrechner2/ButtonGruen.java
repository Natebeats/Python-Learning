/**
 * 
 */
package day0602.taschenrechner2;

import java.awt.Color;

import javax.swing.JButton;

/**
 * @author fred
 *
 */
public class ButtonGruen extends JButton {

	public ButtonGruen(String text) {
		super(text);
		super.setBackground(Color.GREEN);
        setForeground(Color.BLACK); // Schriftfarbe setzen
        setOpaque(true); // Wichtig für einige Look & Feels

        setContentAreaFilled(true);
        setBorderPainted(false); // Optional, entfernt den Rand
	}
	
}
