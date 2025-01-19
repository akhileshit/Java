package Arrays06;

import java.util.Scanner;

public class Schools { // 3D-Jagged Arrays
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][][]arr = new int[3][][];
		
		// Taking #rows in each depth as input (array of 2D arrays)
		for ( int i=0; i<arr.length; i++) {
			System.out.println("Enter #Classrooms in School "+ i);
			arr[i] = new int[scan.nextInt()][];
		}
		
		// Taking #columns in each rows for each depths as input (array of 1D array)
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Enter #Students in School "+ i + " Classroom " + j);
				arr[i][j] = new int[scan.nextInt()];
			}
		}
		
		// Populating 3D Jagged Array
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the age of School " + i + " Classroom " + j + " Student " + k);
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		// Printing 3D Jagged Array
		for (int i=0; i<arr.length; i++) {
			System.out.println("School " + i + ":");
			for (int j=0; j<arr[i].length; j++) {
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		scan.close();
	}
}
