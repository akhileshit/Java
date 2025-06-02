package junitTest07;

import static org.hamcrest.MatcherAssert.assertThat;  //This is the import
import static org.hamcrest.Matchers.*; // This is the import for Matchers
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.List;

import org.junit.jupiter.api.Test;

public class DemoTest { // Hamcrest Matchers
	
	@Test
	void hamcrestMatchers() {
		List<String> names = List.of("John", "Alice", "Bob");
		assertAll(
			() -> assertThat("Junit is awesome", containsString("awesome")),
			() -> assertThat(30, greaterThan(20)),
			() -> assertThat(3, is(3)),  // alternative to assertEquals()!
			() -> assertThat(3, lessThanOrEqualTo(5)),
			
			() -> assertThat("Junit 5", startsWith("Junit")),
			() -> assertThat("Junit 5", containsString("Junit")),
			() -> assertThat("Junit 5", not(containsString("4"))),
			
			() -> assertThat(names, hasItem("John")),
			() -> assertThat(names, hasItems("John", "Bob")),
			() -> assertThat(names, not(hasItems("Sahana", "Bob"))),
			
			() -> assertThat(10, allOf(greaterThan(5), lessThan(20))),   // All shd be true
			() -> assertThat("apple", anyOf(is("apple"), is("banana"))),  // Any one shd be true
			
			() -> assertThat(null, nullValue()),
			() -> assertThat("test", notNullValue()),
			() -> assertThat("hello", instanceOf(String.class))
		);
	}
}

//Again, don't concentrate on assertAll() syntax, just focus on assertThat() & matches like containsString()...
// Use hamcrest Matchers when:
	// Multiple conditions in 1 assert
	// Collection Checks
	// Want readable like syntax