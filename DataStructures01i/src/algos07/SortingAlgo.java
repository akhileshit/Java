package algos07;

import java.util.Scanner;

public class SortingAlgo { // Insertion Sort
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int[] arr = new int[scan.nextInt()];
		
		System.out.println("Enter " + arr.length + " Integers:");
		for (int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		insertionSort(arr); // pass by reference
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		scan.close();
	}
	
	// LOGIC
	public static void insertionSort(int[] arr) {
		int item=0, j=0;
		for (int i=1; i<=arr.length-1; i++) {
			item = arr[i];
			j = i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1] = arr[j] ;
				j--;
			}
			arr[j+1] = item;
		}
	}
}
