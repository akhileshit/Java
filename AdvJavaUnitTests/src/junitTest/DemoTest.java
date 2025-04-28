package junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DemoTest {
	
	@Test
	public void testAdd() {
		Demo demo = new Demo();
		
		int result = demo.add(5, 3);
		
		assertEquals(8, result);
	}
}


//The package of Junit5 - org.junit.jupiter.api
//The package of Junit4 - org.junit

//right-click - RunAs - JUnit Test