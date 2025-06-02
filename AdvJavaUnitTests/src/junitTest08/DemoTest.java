package junitTest08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class DemoTest { // Assumptions & Skipping Tests
	
	@Test
	void runOnlyOnMyProfile() {
		assumeTrue("Akhilesh S".equals(System.getenv("USERNAME"))); //Don't get overwhelmed. This is just a condition.(true/false)
		// Test Logic (ONly runs if the above assumption is true!!)
		assertEquals(4, 2+2);
	}
}
