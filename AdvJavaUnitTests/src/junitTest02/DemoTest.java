package junitTest02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoTest { //Test LifeCycle Annotations
	
	@Test
	public void testAdd1() { 
		
		Demo d = new Demo();
		int result = d.add(3, 4);
		assertEquals(7, result);
		System.out.println("TESTADD1 RESULT IS OUT.");
	}
	
	@Test
	public void testAdd2() { 
		
		Demo d = new Demo();
		int result = d.add(5, 9);
		assertEquals(14, result);
		System.out.println("TESTADD2 RESULT IS OUT.");
	}
	
	
	
	@BeforeAll
	static void setupAll()  { //Runs before 'all' test methods
		System.out.println("THIS IS THE SETUP CODE FOR ALL TESTS.");
		
		try { //I added time just to feel the difference
			Thread.sleep(2000);
		} catch (InterruptedException e) { e.printStackTrace(); }
	}
	
	
	
	@AfterAll
	static void cleanupAll() { //Runs after 'all' test methods
		try { 
			Thread.sleep(2000);
		} catch (InterruptedException e) { e.printStackTrace(); }
		
		System.out.println("THIS IS THE CLEANUP CODE FOR ALL TESTS.");
	}
	
	
	
	@BeforeEach
	void setup()  { //Runs before 'each' test method
		System.out.println("THIS IS THE SETUP CODE FOR EACH TEST.");
		
		try { //I added time just to feel the difference
			Thread.sleep(2000);
		} catch (InterruptedException e) { e.printStackTrace(); }
	}
	
	
	
	@AfterEach
	void cleanup() { //Runs after 'each' test method
		try { 
			Thread.sleep(2000);
		} catch (InterruptedException e) { e.printStackTrace(); }
		
		System.out.println("THIS IS THE CLEANUP CODE FOR EACH TEST.");
	}
	
}
// Methods to run beforeAll & afterAll should be declared 'STATIC'.

