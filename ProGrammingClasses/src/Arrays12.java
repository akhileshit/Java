import java.util.Scanner;

public class Arrays12 { // Find an element and return the index
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter the array elements:");
		for (int i=0; i<5; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		int index = findElement(arr,-75);
		System.out.println("The element found at index " + index);
	}
	
	public static int findElement(int[] arr, int e) {
		for (int i=0; i<5; i++) {
			if (arr[i] == e) {
				return i;
			}
			if (i == arr.length-1 && arr[i] != e) {
				return -1;
			}
		}
		return 0;
	}
}
