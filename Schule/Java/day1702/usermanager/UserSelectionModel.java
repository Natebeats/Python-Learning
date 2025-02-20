package day1702.usermanager;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class UserSelectionModel {
	

    private final PropertyChangeSupport support;


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }


	
	
	private String selectedEmail;
	private List<String> allEMails;

	
	
	public UserSelectionModel() {
		super();
		support = new PropertyChangeSupport(this);
	}

	
	public String getSelectedEmail() {
		return selectedEmail;
	}

	public void setSelectedEmail(String selectedEmail) {
		String old = this.selectedEmail;
		this.selectedEmail = selectedEmail;
		support.firePropertyChange("selectedEmail", old, this.selectedEmail);
	}

	public List<String> getAllEMails() {
		return allEMails;
	}

	public void setAllEMails(List<String> allEMails) {
		List<String> old = this.allEMails;
		this.allEMails = allEMails;
		support.firePropertyChange("allEMails", old, this.allEMails);
	}

	
}
