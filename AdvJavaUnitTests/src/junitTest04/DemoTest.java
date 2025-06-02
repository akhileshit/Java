package junitTest04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

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
	
	
	@TestFactory
	DynamicTest dynamicTestByMe() {
		Demo d = new Demo();
		int result = d.add(2, 2);
		return dynamicTest("Dynamic test", () -> assertEquals(result, 4));
		
	}
	
	@TestFactory
	Collection<DynamicTest> dynamicTestFromCollection() {
		Demo d = new Demo();
		int result = d.add(2, 2);
		return Arrays.asList(
				dynamicTest("1st dynamic test", () -> assertEquals(result, 4)),
				dynamicTest("2nd dynamic test", () -> assertTrue("abc".contains("a")))
				);
				
	}
}
