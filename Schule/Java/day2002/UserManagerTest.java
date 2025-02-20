package day2002;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserManagerTest {
	InterfaceUserManager userManager ;

	@BeforeEach
	void initUserManager() {
		 userManager = new UserManager();

	}
	@Test
	void testUserManagerConstructor() {
		assertNotNull(userManager);
	}

	@Test
	void testKeineUserImManagerCheck() {
		List<User> alleUser = userManager.readUsers();
		assertEquals(0, alleUser.size());
	}

	@Test
	void testAddUserAndTestListsize() {
		userManager.addUser(new User());
		List<User> alleUser = userManager.readUsers();
		assertEquals(1, alleUser.size());
	}

	@Test
	void testAdd2UserAndTestListsize() {
		userManager.addUser(new User());
		userManager.addUser(new User("", "", ""));
		List<User> alleUser = userManager.readUsers();
		assertEquals(2, alleUser.size());
	}

	@Test
	void testAddUserAndFindUser() {
		userManager.addUser(new User("fred@me.com", "fred", "passwort"));
		User gefunden = userManager.findUser("fred@me.com");
		assertEquals("fred@me.com", gefunden.getEmail());
		assertEquals("fred", gefunden.getName());
		assertEquals("passwort", gefunden.getPasswort());
	}

	@Test
	void testExceptionWhenEmailNotUniqe() {
		userManager.addUser(new User("fred@me.com", "fred", "passwort"));
		try {
			userManager.addUser(new User("fred@me.com", "fred", "passwort"));
			fail("user mit gleicher Email nicht erlaubt");
		} catch (RuntimeException e) {

		}
	}

	@Test
	void testAddZweiGleicheUserAndFindUser() {
		userManager.addUser(new User("fred@me.com", "fred", "passwort"));
		userManager.addUser(new User("fred2@me.com", "fred2", "passwort2"));

		List<User> alleUser = userManager.readUsers();
		assertEquals(2, alleUser.size());

		User gefunden = userManager.findUser("fred@me.com");
		assertEquals("fred@me.com", gefunden.getEmail());
		assertEquals("fred", gefunden.getName());
		assertEquals("passwort", gefunden.getPasswort());
	}

	@Test
	void testAddZweiGleicheUser2AndFindUser() {
		userManager.addUser(new User("fred2@me.com", "fred2", "passwort2"));
		userManager.addUser(new User("fred@me.com", "fred", "passwort"));

		List<User> alleUser = userManager.readUsers();
		assertEquals(2, alleUser.size());

		User gefunden = userManager.findUser("fred@me.com");
		assertEquals("fred@me.com", gefunden.getEmail());
		assertEquals("fred", gefunden.getName());
		assertEquals("passwort", gefunden.getPasswort());
	}

	@Test
	void testDeleteUser() {
		userManager.addUser(new User("fred@me.com", "fred", "passwort"));

		userManager.deleteUser("fred@me.com");

		List<User> alleUser = userManager.readUsers();
		assertEquals(0, alleUser.size());

	}

	@Test
	void testDeleteUserNotIncluded() {
		userManager.addUser(new User("fred2@me.com", "fred", "passwort"));

		userManager.deleteUser("fred@me.com");

		List<User> alleUser = userManager.readUsers();
		assertEquals(1, alleUser.size());

	}

	@Test
	void testUpdateUser() {
		userManager.addUser(new User("fred@me.com", "fred", "passwort"));

		userManager.updateUser(new User("fred@me.com", "Fred", "superPasswort"));

		List<User> alleUser = userManager.readUsers();
		assertEquals(1, alleUser.size());

		User gefunden = userManager.findUser("fred@me.com");
		assertEquals("fred@me.com", gefunden.getEmail());
		assertEquals("Fred", gefunden.getName());
		assertEquals("superPasswort", gefunden.getPasswort());
	}

	@Test
	void testUpdateUserNotFound() {
		userManager.addUser(new User("fred@me.com","fred","passwort"));
		
		try {
			userManager.updateUser(new User("fred2@me.com","Fred", "superPasswort"));
			fail("Update User not correct / email not found");
		} catch (RuntimeException e) {
			
		}
	}

	@Test
	void testUpdateUserExtern() {
		userManager.addUser(new User("fred@me.com", "fred", "passwort"));

		User gefunden2 = userManager.findUser("fred@me.com");
		gefunden2.setEmail("fred2@me.com");

		List<User> alleUser = userManager.readUsers();
		assertEquals(1, alleUser.size());

		User gefunden = userManager.findUser("fred@me.com");

		assertEquals("fred@me.com", gefunden.getEmail());
		assertEquals("fred", gefunden.getName());
		assertEquals("passwort", gefunden.getPasswort());
	}

}
