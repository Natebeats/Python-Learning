/**
 * 
 */
package day1102.user;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fred
 *
 */
public class UserManager {

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
