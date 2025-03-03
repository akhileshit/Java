package exceptionHandling09;

import java.util.Scanner;

public class Demo { // Debugging With StackTraces
	
	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers for division (pls / by 0!!)");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Demo1 d1 = new Demo1();
		d1.call2(a, b);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}


// STACKTRACE if printed by DEH
/*
 Exception in thread "main" java.lang.ArithmeticException: / by zero
 at exceptionHandling09.Demo3.divide(Demo3.java:6)
 at exceptionHandling09.Demo2.call1(Demo2.java:7)
 at exceptionHandling09.Demo1.call2(Demo1.java:7)
 at exceptionHandling09.Demo.main(Demo.java:15)
 */

//STACKTRACE if printed by Us
/*
 java.lang.ArithmeticException: / by zero
 at exceptionHandling09.Demo3.divide(Demo3.java:6)
 at exceptionHandling09.Demo2.call1(Demo2.java:7)
 at exceptionHandling09.Demo1.call2(Demo1.java:7)
 at exceptionHandling09.Demo.main(Demo.java:15)
*/

// Only use this in Development Environment but Not in Production Env(use logs of it instead)