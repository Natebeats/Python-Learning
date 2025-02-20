/**
 * 
 */
package day1702.usermanager;

import java.util.ArrayList;
import java.util.List;

/**
 * UserManagerJDBC speicher alles die mysql Datenbank und hat
 * keine intene speicherung der Daten
 * 
 * @author fred
 *
 */
public class UserManagerJDBC {

	List<UserModel> alleUser = new ArrayList<>();
	
	public void createUser(UserModel user) {    //C
		alleUser.add(user);
	}
	
	public UserModel readUser(UserModel user) {
		return readUser(user.getEmail());
	}	
	
	public UserModel readUser(String email) {	// R
		for(UserModel user : alleUser) {
			if(user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}
	
	public List<UserModel> readUsers() {	// Read All
		return alleUser;
		
	}

	public boolean updateUser(UserModel userModel) {	// U
		for(UserModel user : alleUser) {
			if(user.getEmail().equals(userModel.getEmail())) {
				user.setNickname(userModel.getNickname());
				user.setPassword(userModel.getPassword());
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteUser(UserModel user) {	// D
		return alleUser.remove(user);
	}
	



}
