/**
 * 
 */
package day2002;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fred
 *
 */
public class UserManager implements InterfaceUserManager {
	List<User> userListe = new ArrayList<>();

	@Override
	public List<User> readUsers() {
		return new ArrayList<>(userListe);
	}

	@Override
	public void addUser(User user) {
		User foundUser = findUser(user.getEmail());
		if(foundUser == null) {
			userListe.add(user);
		} else {
			throw new RuntimeException();
		}
		
	}

	@Override
	public User findUser(String email) {
		for(User user : userListe) {
			if(email.equals(user.getEmail())) {
				return new User(user);
			}
		}
		return null;
	}

	@Override
	public void deleteUser(String email) {
		User foundUser = findUser(email);
		userListe.remove(foundUser);
	}

	@Override
	public void updateUser(User userUpdate) {
		
		for(User user : userListe) {
			if(user.getEmail().equals(userUpdate.getEmail())) {
				user.setName(userUpdate.getName());
				user.setPasswort(userUpdate.getPasswort());
				return ;
			}
		}
		throw new RuntimeException();
	}

}
