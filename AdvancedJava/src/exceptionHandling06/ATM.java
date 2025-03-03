package exceptionHandling06;

import java.util.Scanner;

public class ATM { // Handling Exception Locally + Re-throwing the Exception to the caller   METHOD-2
	
	void withdraw() throws Exception { 
		try {
		System.out.println("CONNECTION TO THE USER DATABASE ESTABLISHED");
		Scanner sc = new Scanner(System.in);
		System.out.println("ATM WORKS AND CASH WILL BE DISPENSED ONLY IF YOU DO DIVISION");
		System.out.println("Enter ID and PWD for division");
		int id = sc.nextInt();
		int pwd = sc.nextInt();
		int res = id/pwd;
		System.out.println("COLLECT YOUR " + res + "-RS CASH");
		}
		catch (Exception e) {
			System.out.println("ISSUE OCCURED IN ATM AND RESOLVED IN ATM");
			throw e;  // ReThrowing the exception to the caller (Bank) after handling it
			// NOTE: Any code below this "throw" keyword will never be executed unless it is inside "finally" block
		}
		
		finally { // finally block        (To execute the code inside it no-matter-what, like even after throw keyword)
		System.out.println("CONNECTION TO THE USER DATABASE TERMINATED");
		}
	}
}

// Use finally block to avoid losing the valuable resources!!!
// See next package for another method of handling exception