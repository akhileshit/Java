import java.util.Arrays;

public class Arrays18 { // Move all zeros to the end of an array
	public static void main(String[] args) {
		int[] a1 = {0,1,4,5,0,0,1,2,0};
		int[] a2 = new int[a1.length];
		
		int i=0, j=0; 
		while(i<a1.length) {
			if (a1[i] != 0) {
				a2[j] = a1[i];
				j++;
				i++;
			}
			else
				i++;
		}
		while(j<a2.length) {
			a2[j] = 0;
			j++;
		}
		
		System.out.println(Arrays.toString(a2));
	}
}
