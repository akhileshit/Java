package junitTest04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class DemoTest { // Test Execution Annotations
	
	@Test
	void testAdd() {  // This method marked as normal unit Test method
		Demo d = new Demo();
		int result = d.add(5, 85);
		assertEquals(90, result);
	}
	
	
	@RepeatedTest(3)
	void testMultipleTimes() {  //This method is tested 3 times repeateadly
		System.out.println("Running tests...");
	}
	
	
	
	
	
	
	
}
