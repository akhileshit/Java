package exceptionHandling07;

import java.util.Scanner;

public class ATM { // Ducking the Exception  (Leave w/o handling) METHOD-3
	
	void withdraw() throws Exception/*  Same here. NOT "ducks Exception!! :)"  */ { 
		try {
		System.out.println("CONNECTION TO THE USER DATABASE ESTABLISHED");
		Scanner sc = new Scanner(System.in);
		System.out.println("ATM WORKS AND CASH WILL BE DISPENSED ONLY IF YOU DO DIVISION");
		System.out.println("Enter ID and PWD for division(pls try / by 0)");
		int id = sc.nextInt();
		int pwd = sc.nextInt();
		int res = id/pwd;
		System.out.println("COLLECT YOUR " + res + "-RS CASH");
		}

		
		finally { // finally block to safeguard the resources      
		System.out.println("CONNECTION TO THE USER DATABASE TERMINATED");
		}
	}
}

// If You don't handle it, throw it to the caller to handle it!
// U cannot have only "finally" block, hence use it with "try""