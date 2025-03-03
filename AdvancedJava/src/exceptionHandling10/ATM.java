package exceptionHandling10;

import java.util.Scanner;

public class ATM { // Custom Exceptions
	
	void withdraw() throws InvalidUserIdOrPswdException{ 
		
		Scanner sc = new Scanner(System.in);
		int uid = 1111;
		int upwd = 2222;
		System.out.println("Enter ID and PWD");
		int id = sc.nextInt();
		int pwd = sc.nextInt();
		if (id==uid && pwd==upwd)
			System.out.println("COLLECT YOUR MONEY");
		else {
			InvalidUserIdOrPswdException e = new InvalidUserIdOrPswdException();
			System.out.println(e.getMessage());
			throw e;
		}
		
	}
}

