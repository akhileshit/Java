package Arrays04;

import java.util.Scanner;

public class ClassRoom { // Jagged Arrays   -  not uniform rows
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the #Classes:");
		
		int arr[][] = new int[scan.nextInt()][]; // JAGGED ARRAY: each classRooms have diff #students and hence left empty
		
		// Taking user inputs for i: #Students in each class
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter the #Students in Class " + i);
			arr[i] = new int[scan.nextInt()];
		}
		
		// Populating the 2d array elements
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the age of class " + i + " Student " + j);
				arr[i][j] = scan.nextInt();
			}
		}
		
		// Printing the 2d array elements
		System.out.println("=========================================");
		
		System.out.println("Elements in the array are........... ");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
			
		System.out.println("=========================================");
		scan.close();
	}
}
