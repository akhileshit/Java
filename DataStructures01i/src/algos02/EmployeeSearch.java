package algos02;

import java.util.Scanner;

public class EmployeeSearch { // Search employees (Use employee array to store emp details)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many employees?");
		Employee[] arr = new Employee[scan.nextInt()];
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter the id and name of Employee Object " + (i+1) );
			arr[i] = new Employee(scan.nextInt(), scan.next());
		}
		
		System.out.println("Enter the name of the Employee to Search:");
		String e = scan.next();
		
		SearchAlgo sa = new SearchAlgo();
		
		int index = sa.linearSearch(arr, e);
		
		if (index >= 0)
			System.out.println("Employee found at index " + index + "!!!");
		else
			System.out.println("Employee not found!");
		
		scan.close();
	}
}
