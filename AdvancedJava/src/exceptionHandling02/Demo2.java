package exceptionHandling02;

import java.util.Scanner;

public class Demo2 { // Unreachable catch blocks
	
	public static void main(String[] args) {
		
		System.out.println("Connection Established!");
//		try {
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
//		}
		// UDEH
		// CONSUMES ALL THE EXCEPTIONS
//		catch (Exception e) { // Generic Catch block
//			System.out.println("SOME ISSUE OCCURED. DONT WORRY YOU DATA IS SAFE AND SECURE. PLEASE TRY AGAIN...");
//		} 
		
		// UNREACHABLE CATCH BLOCKS uncomment below to see
//		catch (ArithmeticException e) {
//			System.out.println("ArithmeticException Occured at line 15. Maybe due to / by zero.");
//		}
//		catch (NegativeArraySizeException e) {
//			System.out.println("NegativeArraySizeException Occured at line 19. Try again and give +ve integer for size.");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArithmeticException Occured at line 21. Try again by giving index position within range.");
//		}
		
		
		System.out.println("Connection Terminated!");
	}
}
