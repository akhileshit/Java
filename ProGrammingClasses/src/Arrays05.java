import java.util.Scanner;

public class Arrays05 { // Sort 0s, 1s, and 2s of array in linear time and constant space
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[6];
		
		System.out.println("Enter 6 no.s to store in array(only 0s, 1s and 2s)");
		for( int i=0; i<6; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int count0=0, count1=0;
		for(int i=0; i<6; i++) {
			if(a[i]==0) { // count # 0s
				count0++;
			}
			if(a[i]==1) { // count # 1s
				count1++;
			}
		}
		
		for(int i=0; i<count0; i++) { // 1st fill 0s
			a[i] = 0;
		}
		for(int i=count0; i<count1+count0; i++) { // then fill 1s
			a[i] = 1;
		}
		for(int i=count1+count0; i<6; i++) { // rest with 2s
			a[i] = 2;
		}
		
		System.out.println("Sorted 0s, 1s, and 2s:"); // print final sorted 0s, 1s and 2s
		for(int i=0; i<6; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
