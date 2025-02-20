/**
 * 
 */
package day0502;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author fred
 *
 */
public class WuerfelApplikation extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel wuerfel;

	public WuerfelApplikation() {
		this.setTitle("Würfel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		JButton button = new JButton("Würfeln");
		this.add(button);
		button.addActionListener(this);
		this.wuerfel = new JLabel("Würfelzahl: 6");
		this.add(wuerfel);
		this.pack();
		this.setVisible(true);
	}
	
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		JFrame meinApplikation
		= new WuerfelApplikation();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int w = (int) (Math.random()*6 + 1);
		this.wuerfel.setText("Würfelzahl: " + w);
	}

}
