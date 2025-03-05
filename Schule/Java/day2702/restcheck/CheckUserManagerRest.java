package day2702.restcheck;

public class CheckUserManagerRest {
	public static void main(String[] args) throws Exception {
		UserManagerREST userManagerRest = new UserManagerREST();
		
		userManagerRest.deleteUser("fred7@me.com");
		
		User user = userManagerRest.getUser("fred7@me.com");
		System.out.println(user);
		
		User neuerUser = new User();
		neuerUser.setEmail("fred7@me.com");
		neuerUser.setNickname("helge");
		neuerUser.setPasswort("Passw0rt!");
		userManagerRest.createUser(neuerUser);

		user = userManagerRest.getUser("fred7@me.com");
		System.out.println(user);

		neuerUser.setNickname("fred");
		neuerUser.setName("Fred Gerber");
		userManagerRest.updateUser("fred7@me.com", neuerUser);

		user = userManagerRest.getUser("fred7@me.com");
		System.out.println(user);
	}
}
