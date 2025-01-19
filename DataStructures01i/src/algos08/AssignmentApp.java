package algos08;

import java.util.Scanner;

public class AssignmentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("**THIS IS THE APP FOR SEARCHING AND SORTING**");
		System.out.println("Enter the #Elements in the array:");
		int [] arr = new int[scan.nextInt()];
		
		System.out.println("Enter " + arr.length + " Integer elements: ");
		for (int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		while(true) {
			System.out.println("\n==================================================");
			System.out.println("Press 1 for Linear Search.");
			System.out.println("Press 2 for Binary Search.");
			System.out.println("Press 3 for Sorting.");
			System.out.println("Press any other key to EXIT.");
			char choice=scan.next().charAt(0);
			
			switch(choice) {
				case '1': // ***********************************************************
					System.out.println("LINEAR SEARCH");
					System.out.println("Enter the key to Search: ");
					int key = scan.nextInt();
					int pos = SearchSortApp.linearSearch(arr, key);
					if (pos == -1) {
						System.out.println("KEY NOT FOUND");
					}
					else
						System.out.println("KEY FOUND AT POSITION " + pos);
					break;
					
				case '2': // ***********************************************************
					System.out.println("BINARY SEARCH");
					System.out.println("Enter the key to Search: ");
					int key1 = scan.nextInt();
					System.out.println("Please Choose the Sorting Algorithm:");
					System.out.println("Press a for Bubble Sort.");
					System.out.println("Press b for Selection Sort.");
					System.out.println("Press c for Insertion Sort.");
					char sortChoice = scan.next().toLowerCase().charAt(0);
					switch(sortChoice) {
						case 'a': 
							SearchSortApp.bubbleSort(arr);
							int pos1 = SearchSortApp.binarySearch(arr, key1);
							if (pos1 == -1) {
								System.out.println("KEY NOT FOUND");
							}
							else
								System.out.println("KEY FOUND AT POSITION " + pos1);
							break;
						case 'b': 
							SearchSortApp.selectionSort(arr);
							int pos2 = SearchSortApp.binarySearch(arr, key1);
							if (pos2 == -1) {
								System.out.println("KEY NOT FOUND");
							}
							else
								System.out.println("KEY FOUND AT POSITION " + pos2);
							break;
						case 'c': 
							SearchSortApp.insertionSort(arr);
							int pos3 = SearchSortApp.binarySearch(arr, key1);
							if (pos3 == -1) {
								System.out.println("KEY NOT FOUND");
							}
							else
								System.out.println("KEY FOUND AT POSITION " + pos3);
							break;
						default: 
							SearchSortApp.bubbleSort(arr);
							int pos4 = SearchSortApp.binarySearch(arr, key1);
							if (pos4 == -1) {
								System.out.println("KEY NOT FOUND");
							}
							else
								System.out.println("KEY FOUND AT POSITION " + pos4);
							break;
					}
					break;
					
					
				case '3': // ***********************************************************
					
					System.out.println("Choose the Sorting Algorithm:");
					System.out.println("Press 'bl' for Bubble Sort.");
					System.out.println("Press 'sl' for Selection Sort.");
					System.out.println("Press 'in' for Insertion Sort.");
					String sortChoicee = scan.next().toLowerCase();
					switch(sortChoicee) {
						case "bl":
							System.out.println("BUBBLE SORT");
							SearchSortApp.bubbleSort(arr);
							System.out.println("Sorted Array:");
							for (int i=0; i<arr.length; i++) {
								System.out.print(arr[i] + " ");
							}
							System.out.println();
							break;
						case "sl":
							System.out.println("SELECTION SORT");
							SearchSortApp.selectionSort(arr);
							System.out.println("Sorted Array:");
							for (int i=0; i<arr.length; i++) {
								System.out.print(arr[i] + " ");
							}
							System.out.println();
							break;
						case "in": 
							System.out.println("INSERTION SORT");
							SearchSortApp.insertionSort(arr);
							System.out.println("Sorted Array:");
							for (int i=0; i<arr.length; i++) {
								System.out.print(arr[i] + " ");
							}
							System.out.println();
							break;
							
					}
					break;
					
					default : System.out.println("Exited"); return;
			}
		}
	}

}
