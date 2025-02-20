package day1702.usermanager;

import java.util.List;

public interface InterfaceUserManager {
	
	public boolean createUser();
	
	public UserModel readUser();  // könnte auch ein find sein
	
	public boolean updateUser();
	
	public boolean deleteUser();
	
	public List<UserModel> listUser();
	
	public boolean findSelectedUser();

	public boolean findSelectedUser(String string);
	
}
