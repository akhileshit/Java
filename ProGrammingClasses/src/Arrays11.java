import java.util.Arrays;

public class Arrays11 { // Exploring Arrays.sort() and Arrays.toString()

	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] arr2 = {1, 3, 2, 4, 5};
		
		System.out.println(Arrays.toString(arr)); 
		System.out.println(Arrays.toString(arr2)); 
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2)); 
		
	}

}
