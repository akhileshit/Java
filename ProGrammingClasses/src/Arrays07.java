import java.util.Scanner;

public class Arrays07 { // print in reverse order
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		System.out.println("Enter the array elements:");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			
		}
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
