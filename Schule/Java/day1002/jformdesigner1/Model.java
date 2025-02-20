package day1002.jformdesigner1;

import java.beans.PropertyChangeSupport;

public class Model extends BaseModelObject {
	String labelText = "Hello World";

	public String getLabelText() {
		return labelText;
	}

	public void setLabelText(String labelText) {
		String old = this.labelText;
		this.labelText = labelText;
		changeSupport.firePropertyChange("labelText", old, labelText);
	}
	
	
}
