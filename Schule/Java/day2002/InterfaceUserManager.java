package day2002;

import java.util.List;

public interface InterfaceUserManager {

	public List<User> readUsers();

	public void addUser(User user);

	public User findUser(String email);

	public void deleteUser(String email);

	public void updateUser(User user);

}
