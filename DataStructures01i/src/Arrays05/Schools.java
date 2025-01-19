package Arrays05;

import java.util.Scanner;

public class Schools { // 3D Arrays
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][][] = new int[3][2][3];
		
		// Populate
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the age of School " + i + " Classroom " + j + " Student " + k);
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		// Print
		System.out.println("===================================");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("============= Depth: " + i + "================");
		}
		System.out.println("===================================");
		
		scan.close();
	}
}
