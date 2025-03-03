package exceptionHandling08;

import java.sql.SQLException;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class Eagle extends Bird {
	
	@Override
	void fly() { // Throwing NO exception, but parent method is. (Possible)
		System.out.println("Eagle Bird is Flying");
	}
	
//	@Override
//	void eat() throws SQLException { // Throwing different exception("Checked") (hence shows Error) (instead u can throw one unchecked exception!!!)
//		System.out.println("Eagle Bird is Eating");
//	}
	
	@Override
	void sleep() throws SQLException { // Throwing different exception but has a "is-a" relationship
		System.out.println("Eagle Bird is Sleeping");
	}
	
	@Override
	void foodHabit() throws ArithmeticException, NegativeArraySizeException, IllegalArgumentException, InputMismatchException  { // Throwing different exception("Unchecked") (hence no error)
		System.out.println("Eagle Bird is Carnivorous");
	}
}

// For Checked Exception in parent, u can also throw any unchecked e in child!!!