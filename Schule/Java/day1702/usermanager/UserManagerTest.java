/**
 * 
 */
package day1702.usermanager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author fred
 *
 */
class UserManagerTest {

	@Test
	void testUserManager() {
		UserManager userManager = new UserManager();
		assertNotNull(userManager);
//		assertEquals(0, userManager.readUsers().size());
		userManager.createUser(new UserModel());
		
	}

}
