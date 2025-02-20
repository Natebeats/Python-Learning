package day1002.jformdesigner1;

import java.beans.PropertyChangeSupport;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author fred
 *
 */
public class BaseModelObject {

	/**
	 * 
	 */
	protected final PropertyChangeSupport changeSupport ;

	
	/**
	 * 
	 */
	public BaseModelObject() {
		super();
		changeSupport = new PropertyChangeSupport(this);
	}


	/**
	 * @param listener
	 */
	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	/**
	 * @param listener
	 */
	public void removePropertyChangeListener(final PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}
}
