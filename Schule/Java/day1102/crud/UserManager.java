package day1102.crud;

import java.util.ArrayList;
import java.util.List;

import day1102.user.UserModel;

public class UserManager {
	private List<UserModel> users = new ArrayList<>();

	public void createUser(String nickname, String email, String password) {
		users.add(new UserModel(nickname, email, password));
	}

	public void createUser(UserModel user) {
		users.add(new UserModel(user));
	}

	public UserModel readUser(String email) {
		for (UserModel user : users) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}

	public void updateUser(String email, String newNickname, String newPassword) {
		UserModel user = readUser(email);
		if (user != null) {
			user.setNickname(newNickname);
			user.setPassword(newPassword);
		}
	}

	public void deleteUser(String email) {
		users.remove(readUser(email));
	}

	public void listUsers() {
		for (UserModel user : users) {
			System.out.println(user);
		}
	}
}