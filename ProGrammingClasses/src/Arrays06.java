import java.util.Scanner;

public class Arrays06 { // sum of all the elements in an array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		System.out.println("Enter the array elements:");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
	
	
}
