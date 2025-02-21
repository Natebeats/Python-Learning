package day2102.menu;

import day2102.ModelChangeSupport;

public class MenuModel extends ModelChangeSupport{

	boolean menueVisible = false;

	public boolean isMenueVisible() {
		return menueVisible;
	}

	public void setMenueVisible(boolean menueVisible) {
		boolean old = this.menueVisible;
		this.menueVisible = menueVisible;
		changeSupport.firePropertyChange("menueVisible", old, menueVisible);
	}
}
