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

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * zeigt die Tastatur an
 * @author fred
 *
 */
public class TaschenrechnerTastatur extends JPanel {
	List<String> felder = new ArrayList<>(
			Arrays.asList("AC","","","/",
					      "7", "8","9","*",
					      "4", "5","6","-",
					      "1", "2","3","+",
					      "", "0","","=")
					      );

	public TaschenrechnerTastatur(ICallbackTaschenrechner callbackTaschenrechner) {
		this.setLayout(new GridLayout(0, 4));

		for (String v : felder) {
			if (v.isEmpty()) {
				JLabel l = new JLabel();
				this.add(l);
			} else {
				JButton button = null;
				if(isInteger(v)) {
					button = new JButton(v);
					button.addActionListener(getZahlActionLister(callbackTaschenrechner,v));
				} else {
					if(v.equals("=")) {
						button = new ButtonGelb(v);
					} else {
						button = new ButtonGruen(v);
					}
					button.addActionListener(getOperatonActionLister(callbackTaschenrechner,v));	
				}
				this.add(button);
			}
		}
	}

	private boolean isInteger(String v) {
		try {
			Integer.parseInt(v);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private ActionListener getOperatonActionLister(ICallbackTaschenrechner callbackTaschenrechner, String v) {
		// TODO Auto-generated method stub
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				callbackTaschenrechner.doOperation(v);
				
			}
		};
	}

	private ActionListener getZahlActionLister(ICallbackTaschenrechner callbackTaschenrechner, String v) {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				callbackTaschenrechner.doZahl(v);
				
			}
		};
	}
}
