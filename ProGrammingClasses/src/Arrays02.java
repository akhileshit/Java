import java.util.Scanner;

public class Arrays02 { // store array and display
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length to be");
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
