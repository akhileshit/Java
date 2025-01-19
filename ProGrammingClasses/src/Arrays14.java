import java.util.Arrays;

public class Arrays14 { // Reverse an array
	public static void main(String[] args) { 
		int[] arr2 = {1,2,3,4,5};
		int[] arr = {1,2,3,4,5,6};
		
		int i = 0, j=arr.length -1, eMid = arr.length/2, oMid = eMid+1;
		
		System.out.println("Heyy");
		// Odd
		if(arr.length%2 != 0) {
			for(i=0,j=arr.length-1; i<oMid && j>=oMid-1; i++, j--) {
				if(i!=j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if (i > j) {
				System.out.println(Arrays.toString(arr));
			}
		}
		
		// Even
		if(arr.length%2 == 0) {
			for(i=0,j=arr.length-1; i<eMid && j>=eMid-1; i++, j--) {
				if(i!=j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
			System.exit(0);
			
			
		}
		
		
		
	}
}
