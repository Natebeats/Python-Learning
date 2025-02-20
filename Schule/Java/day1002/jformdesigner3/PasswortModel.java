package day1002.jformdesigner3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Objects;

public class PasswortModel {
	

    private final PropertyChangeSupport support;

	public PasswortModel() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

	
	private String email;
	private String passwort;
	private String loginStatus;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		String old = this.email;
		this.email = email;
		support.firePropertyChange("email", old, email);
	}
	
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		String old = this.passwort;
		this.passwort = passwort;
		support.firePropertyChange("passwort", old, passwort);
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		String old = this.loginStatus;
		this.loginStatus = loginStatus;
		support.firePropertyChange("loginStatus", old, loginStatus);
	}
	@Override
	public String toString() {
		return "PasswortModel [email=" + email + ", passwort=" + passwort + ", loginStatus=" + loginStatus + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, loginStatus, passwort);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PasswortModel other = (PasswortModel) obj;
		return Objects.equals(email, other.email) && Objects.equals(loginStatus, other.loginStatus)
				&& Objects.equals(passwort, other.passwort);
	}
	
	
}
