package day1902.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class UserServiceTest {
	   @Test
	    void testGetUserName() {
	        // Mock des UserRepositorys erstellen
	        UserRepository mockRepository = mock(UserRepository.class);
	        
	        // Verhalten des Mocks festlegen
	        when(mockRepository.findUserById(1)).thenReturn("Alice");
	        when(mockRepository.findUserById(2)).thenReturn("Alice2");
	        
	        // UserService mit Mock testen
	        UserService userService = new UserService(mockRepository);
//	        String result = userService.getUserName(2);
	        
	        // Ergebnis überprüfen
	        assertEquals("Alice", userService.getUserName(1));
	        assertEquals("Alice2", userService.getUserName(2));
	    }
}
