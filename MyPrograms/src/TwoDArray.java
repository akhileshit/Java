import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = 3;
		int n = 3;
		int[][] arr = new int[m][n];
		
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		
		System.out.println("Enter " + m*n + " Numbers to store inside 2D Array:");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
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
