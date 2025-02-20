package day1902.tests;

public class UserService {
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public String getUserName(int userId) {
		return userRepository.findUserById(userId);
	}

}
