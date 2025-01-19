package algos03;

import java.util.Scanner;

public class SearchigAlgo { // Binary Search

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int[] arr = new int[scan.nextInt()];
		
		System.out.println("Enter " + arr.length + " Integers in SORTED Order:");
		for (int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		scan.close();
		System.out.println("Enter the key to Search:");
		int k = scan.nextInt();
		
		// LOGIC
		int low=0, mid=0, high=arr.length-1;
		while (low<=high) { // if low becomes > high, STOP
			mid = (low+high)/2;
			
			if (k == arr[mid]) {
				System.out.println("Key found at index " + mid);
				return;
			}
			if (k < arr[mid]) {
				high = mid-1;
				
			}
			if (k > arr[mid]) {
				low = mid +1;
			}
			
		}
		System.out.println("Key Not Found");
		

	}

}
