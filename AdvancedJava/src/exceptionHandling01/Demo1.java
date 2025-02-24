package exceptionHandling01;

import java.util.Scanner;

public class Demo1 { // Default Exception Handler (inside JVM)
	
	public static void main(String[] args) {
		
		System.out.println("Connection Established!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers to divide");
		int a = scan.nextInt();
		int b = scan.nextInt(); // Try giving it 0 to see the Exception
		int c = a/b;
		System.out.println(c);
		
		System.out.println("Enter the size of the array");
		int[] arr = new int[scan.nextInt()]; // Try giving -ve integer for Exception
		System.out.println("Enter position and element to insert");
		int pos = scan.nextInt(); // Try giving integer > size of array to see Exception
		arr[pos] = scan.nextInt();
		for (int x: arr) System.out.print(x + " ");
		System.out.println();
		
		System.out.println("Connection Terminated!");
		
	}
}


// But the Problem here is code below the line which generated e does not get executed