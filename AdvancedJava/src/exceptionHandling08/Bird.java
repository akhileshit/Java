package exceptionHandling08;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Bird { // Method Overriding ft. Exceptions
	
	void fly() throws SQLException {
		System.out.println("Bird is Flying");
	}
	
	void eat() throws FileNotFoundException {
		System.out.println("Bird is Eating");
	}
	
	void sleep() throws Exception {
		System.out.println("Bird is Sleeping");
	}
	
	void foodHabit() throws ArrayIndexOutOfBoundsException {
		System.out.println("Bird has a Food Habit");
	}
}

