import java.util.Scanner;

public class Arrays08 { // print odd index values
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		System.out.println("Enter the array elements:");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			
		}
		for(int i=0; i<arr.length; i++) {
			if(i%2!=0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
