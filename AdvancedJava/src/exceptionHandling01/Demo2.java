package exceptionHandling01;

import java.util.Scanner;

public class Demo2 { // User Defined Exception Handler
	
	public static void main(String[] args) {
		
		System.out.println("Connection Established!");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 2 numbers to divide");
			int a = scan.nextInt();
			int b = scan.nextInt(); // Try giving it 0
			int c = a/b;
			System.out.println(c);
			
			System.out.println("Enter the size of the array");
			int[] arr = new int[scan.nextInt()]; // Try giving -ve integer for Exception
			System.out.println("Enter position and element to insert");
			int pos = scan.nextInt(); // Try giving integer > size of array to see Exception
			arr[pos] = scan.nextInt();
			for (int x: arr) System.out.print(x + " ");
			System.out.println();
		}
		// UDEH
		catch (Exception e) { // catch that exception object if any of the lines inside "try" generates it
			System.out.println("SOME ISSUE OCCURED. PLEASE TRY AGAIN...");
		}
		
		System.out.println("Connection Terminated!");
	}
}
