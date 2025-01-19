package algos05;

import java.util.Scanner;

public class EmployeeSort { // Search employees (Use employee array to store emp details)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many employees?");
		Employee[] arr = new Employee[scan.nextInt()];
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter the id and name of Employee Object " + (i+1) );
			arr[i] = new Employee(scan.nextInt(), scan.next().toUpperCase());
		}
		
		SortingAlgo sa = new SortingAlgo();
		
		Employee[] sorted = sa.bubbleSort(arr);
		
		// Print Sorted Array
		for (int i=0; i<sorted.length; i++) {
			System.out.print(sorted[i].getName() + " ");
		}
		
		scan.close();
	}
}
