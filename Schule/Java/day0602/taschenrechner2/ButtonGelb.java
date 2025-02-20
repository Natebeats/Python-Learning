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
public class ButtonGelb extends JButton {

	/**
	 * @param text
	 */
	public ButtonGelb(String text) {
		super(text);
		super.setBackground(Color.YELLOW);
        setForeground(Color.BLACK); // Schriftfarbe setzen
        setOpaque(true); // Wichtig für einige Look & Feels

        setContentAreaFilled(true);
        setBorderPainted(false); // Optional, entfernt den Rand

	}
	
}
