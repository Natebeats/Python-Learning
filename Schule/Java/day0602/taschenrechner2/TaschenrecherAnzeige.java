/**
 * 
 */
package day0602.taschenrechner2;

import java.awt.Color;

import javax.swing.JTextField;

/**
 * @author fred
 *
 */
public class TaschenrecherAnzeige extends JTextField {
	
	/**
	 * 
	 */
	public TaschenrecherAnzeige() {
		setText("");
		setEditable(false);
	}
	
	public void errorAnzeigen() {
		setText("error");
		setBackground(Color.RED);
	}
	
	@Override
	public String getText() {
		String res =  super.getText();
		if(res.equals("error")){
			return "0";
		} else {
			return res;
		}
		
	}
	
	@Override
	public void setText(String text) {
		super.setText(text);
		setBackground(Color.WHITE);
	}
}
