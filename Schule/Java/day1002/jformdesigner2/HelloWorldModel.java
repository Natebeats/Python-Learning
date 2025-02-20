/**
 * 
 */
package day1002.jformdesigner2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author fred
 *
 */
public class HelloWorldModel {
    private final PropertyChangeSupport support;

	public HelloWorldModel() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
	
	private String helloWorldText = "der Text von Hello World, sieht gut aus";

	private String wert1 = "";
	private String wert2 = "";
	private String ergebnis = "";
	
	
	public String getHelloWorldText() {
		return helloWorldText;
	}

	public void setHelloWorldText(String helloWorldText) {
		String old = this.helloWorldText;
		this.helloWorldText = helloWorldText;
		support.firePropertyChange("helloWorldText", old, helloWorldText);
	}

	public String getWert1() {
		return wert1;
	}

	public void setWert1(String wert1) {
		String old = this.wert1;
		this.wert1 = wert1;
		support.firePropertyChange("wert1", old, wert1);
	}

	public String getWert2() {
		return wert2;
	}

	public void setWert2(String wert2) {
		String old = this.wert2;
		this.wert2 = wert2;
		support.firePropertyChange("wert2", old, wert2);
	}

	public String getErgebnis() {
		return ergebnis;
	}

	public void setErgebnis(String ergebnis) {
		String old = this.ergebnis;
		this.ergebnis = ergebnis;
		support.firePropertyChange("ergebnis", old, ergebnis);
	}
	
	
}
