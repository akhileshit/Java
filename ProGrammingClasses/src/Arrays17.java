import java.util.Arrays;

public class Arrays17 { // Rotate an array to right 1 time
	public static void main(String[] args) {
		int[] a1 = {1,2,4,8};
		int[] a2 = new int[a1.length];
		
		a2[0] = a1[a1.length-1];
		for (int i=0; i<a1.length-1; i++) {
			a2[i+1] = a1[i];
		}
		System.out.println(Arrays.toString(a2));
	}
	
//	public static void main(String[] args) {
//		int[] a = {1,2,4,8};
//		
//		int temp = a[i+1];
//		a[i+1] = a[i];
//		a[a.length-1] = temp;
//		System.out.println(Arrays.toString(a));
//	}
}
