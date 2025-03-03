package exceptionHandling11;

import java.util.Scanner;

public class Registration { 
	
	void register() throws UnderAgeException, OverAgeException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		if (age>=18 && age<=50) {
			System.out.println("Registered Successfully..");
		}
		else if (age<18) {
			UnderAgeException e1 = new UnderAgeException();
			System.out.println(e1.getMessage());
			throw e1;
		}
		else {
			OverAgeException e2 = new OverAgeException();
			System.out.println(e2.getMessage());
			throw e2;
		}
	}
}
