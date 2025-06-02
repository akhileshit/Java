package junitTest06;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoTest { // Grouped Assertion
	
	@Test
	void groupedTests() { // Checks for all asserts even if some fails
		assertAll("Grouped Assertions",       // It's always a good idea to also include[optional] descriptive message inside a group
			() -> assertEquals("John", "John"),
			() -> assertEquals("do", "doe"),
			() -> assertEquals(3, 30)
		);
	}
}


//Nested assertAll() also possible