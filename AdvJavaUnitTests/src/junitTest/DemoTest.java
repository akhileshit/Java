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
