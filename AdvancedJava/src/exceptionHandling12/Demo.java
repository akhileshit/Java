package exceptionHandling12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo { // Java 8 and above new feature (Multiple e handling inside single catch
	
	public static void main(String[] args) { 
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int c = num1/num2;
		System.out.println("Enter the Array Size");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the index to get an element");
		System.out.println(arr[sc.nextInt()]);
		}
		
		// Multiple exception handling inside 'single' catch
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException | NegativeArraySizeException e) {
			e.printStackTrace();
			System.out.println("Dil tho pagal hai Dil diwana hai");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
