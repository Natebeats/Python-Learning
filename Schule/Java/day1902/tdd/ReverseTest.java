package day1902.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class Reverse{
	public String reverse(String input) {
		return new StringBuilder(input).reverse().toString();
	}
}

public class ReverseTest {

	@Test
	void testAddiere() {
		Reverse reverse = new Reverse();
		assertNotNull(reverse.reverse(""));
		assertEquals("A", reverse.reverse("A"));
		assertEquals("b", reverse.reverse("b"));
		assertEquals("abba", reverse.reverse("abba"));
		assertEquals("abbA", reverse.reverse("Abba"));

		assertEquals("otto", reverse.reverse("otto"));
		assertEquals("ottO", reverse.reverse("Otto"));

	}
	
    @Test
    void testReverseStringWithNull() {
    	Reverse class2Test = new Reverse();
    	try {
    		class2Test.reverse(null);
            fail("Erwartete NullPointerException wurde nicht geworfen");

    	} catch(NullPointerException e) {
            assertEquals("Cannot invoke \"String.length()\" because \"str\" is null", e.getMessage());
                		
    	}
    }
}
