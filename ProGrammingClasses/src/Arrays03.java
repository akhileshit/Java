import java.util.Scanner;

public class Arrays03 { // Move all zeros to end of the array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		
		for( int i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		
		int j = 0;
		for(int i=0; i<5; i++) {
			if(a[i] != 0) {
				a[j] = a[i];
				a[i] = 0;
				j++;
			}
		}
		
		for( int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
	}
}
// pending....................