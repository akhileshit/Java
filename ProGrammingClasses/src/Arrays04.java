import java.util.Scanner;

public class Arrays04 { // find 2nd largest number in an array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		
		System.out.println("Enter 5 no's to store in an array");
		for( int i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int max=0;
		for(int i=0; i<5; i++) {
			if(a[i]>max) {
				max = a[i]; // Largest value
			}
		}
		
		int max2=0;
		for(int i=0; i<5; i++) {
			if(a[i]>max2 && a[i]!=max) {
				max2 = a[i]; // 2nd Largest value
			}
		}
		
		System.out.println("The 2nd largest value in the given array is " + max2);
	
	}
}
