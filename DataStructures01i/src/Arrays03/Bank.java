package Arrays03;

import java.util.Scanner;

public class Bank { //2D Arrays
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String arr[][] = new String[5][6];
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the name of bank " + i + " customer " + j);
				arr[i][j] = scan.next();
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " "); 
			}
			System.out.println();
		}
		
		
	}
}
