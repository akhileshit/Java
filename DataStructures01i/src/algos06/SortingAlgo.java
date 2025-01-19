package algos06;

import java.util.Scanner;

public class SortingAlgo { // Selection Sort

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int[] arr = new int[scan.nextInt()];
		
		System.out.println("Enter " + arr.length + " Integers:");
		for (int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		arr = selectionSort(arr);
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		scan.close();
	}
	
	// LOGIC
	public static int[] selectionSort(int[] arr) {
		int min=0, pos=0;
		for (int i=0; i<=arr.length-2; i++) {
			min=arr[i];
			pos = i;
			for (int j=i+1; j<=arr.length-1; j++) {
				if (arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			// Swap - keeping the min element in it's right place
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		return arr;
	}

}
