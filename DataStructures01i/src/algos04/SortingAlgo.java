package algos04;

import java.util.Scanner;

public class SortingAlgo { // Bubble Sort
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int[] arr = new int[scan.nextInt()];
		
		System.out.println("Enter " + arr.length + " Integers:");
		for (int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		// LOGIC
		for (int i=0; i<=arr.length-2; i++) {
			Boolean swap = false;
			for (int j=0; j<=(arr.length)-2-i; j++) {
				if (arr[j] > arr[j+1]) {
					// Swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(!swap) break; // Early-exit if already sorted in the middle of iterations
		}
		// Print Sorted Array
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}
}
