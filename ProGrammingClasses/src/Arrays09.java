import java.util.Scanner;

public class Arrays09 { // find # unique elements in the array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		System.out.println("Enter the array elements:");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			
		}
		int count = 1;
		for(int i=0; i<arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				count ++;
			}
		}
		System.out.println("# Unique elements = " + count);
	}
}
