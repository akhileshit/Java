package junitTest05;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class DemoTest { // Standard Assertions
	
	@Test
	void standardAssertions() {
		String a = "hello";
		String b = a;
		String c = new String("hello");
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		assertAll("Standard Assertions",
			() -> assertEquals(4, 3 + 2, "should be equal"),      //assertEquals()           (expected, actual, message[optional])
			() -> assertNotEquals(4, 2 + 3),       //assertNotEquals()
			() -> assertTrue("abc".contains("m")),      //assertTrue()
			() -> assertFalse("abc".contains("m")),        //assertFalse()
			() -> assertNull(null),        //assertNull()
			() -> assertNotNull("hello"),        //assertNotNull()
			() -> assertThrows(ArithmeticException.class, () -> {        //assertThrows()
				System.out.println(2/2);
			}),
			() -> assertDoesNotThrow(() -> {        //assertDoesNotThrow()                verifies that no exception is thrown!
				System.out.println(2/0);
			}),
			() -> assertSame(a, b),       //assertSame()               Even the object ref shd be same!
			() -> assertNotSame(a, c),       //assertNotSame()        
			() -> assertArrayEquals(arr1, arr2),         //assertArrayEquals()
			() -> assertTimeout(Duration.ofSeconds(2), () -> {      //assertTimeout()
				Thread.sleep(2000);
				}, "shd not take longer than 2 sec."
			)
		);
	}
}

//Don't get overwhelmed by the syntax of assertAll(string, Executable)[Next Topic]. Just concentrate on the assertions!
// Also see multiple errors(if any) in "Failure Trace" tab (to get perfect understanding)

// Also find out the diff b/w org.junit.Assert.* & org.junit.jupiter.api.Assertions.*        [1 for Junit4 and 1 for Junit 5]
// Also find out why all imports are static          [So that u can use those methods w/o prefixing with class names!!]