package exceptionHandling05;

import java.util.Scanner;

public class ATM { // Handling Exception Locally      (But the issue here is bank will not know the issue occurred @ ATM!!, which is not good)
	
	void withdraw() { 
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
		}
		
		System.out.println("CONNECTION TO THE USER DATABASE TERMINATED");
	}
}

// See next package to resolve the above said issue