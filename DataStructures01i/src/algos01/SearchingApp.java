package algos01;

import java.util.Scanner;

public class SearchingApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of array:");
		int arr[] = new int[scan.nextInt()];
		
		System.out.println("Enter " +arr.length+ " elements:" );	
		for (int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the Key to Search:");
		int k = scan.nextInt();
		
		SearchingAlgos sa = new SearchingAlgos();
		int index = sa.linearSearch(arr, k);
		
		if (index >= 0) 
			System.out.println("Key found at index " + index + "!!!");
		else
			System.out.println("Key Not found!");
		
		scan.close();

	}

}
