package exceptionHandling04;

import java.util.Scanner;

public class Demo { // Propagation of Exception
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers for division");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Demo1 d1 = new Demo1();
		d1.call2(a, b);
	}
}


// STACKTRACE
/*
 Exception in thread "main" java.lang.ArithmeticException: / by zero
 at exceptionHandling04.Demo3.divide(Demo3.java:6)
 at exceptionHandling04.Demo2.call1(Demo2.java:7)
 at exceptionHandling04.Demo1.call2(Demo1.java:7)
 at exceptionHandling04.Demo.main(Demo.java:15)
 */
