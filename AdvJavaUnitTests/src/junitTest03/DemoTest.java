package junitTest03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class DemoTest { //Test Control Annotations
	
	@DisplayName("Simple Addition Test")  // Provides Name to a Test
	@Test
	public void testAdd1() {
		
		Demo d = new Demo();
		int result = d.add(3, 4);
		assertEquals(7, result);
	}
	
	@Disabled
	public void testAdd2() {  // This method marked as not to run
		
		Demo d = new Demo();
		int result = d.add(5, 4);
		assertEquals(9, result);
	}
	
	@Nested
	@DisplayName("Tests for empty stack")
	class EmptyStackTests {   // Grouping related tests inside a Nested class

	    @Test
	    void isEmpty() {
	        System.out.println("Nested Related Test 1");
	    }
	    
	    @Test
	    void isFull() {
	    	System.out.println("Nested Related Test 2");
	    }
	}
}


