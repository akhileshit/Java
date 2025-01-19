
public class Arrays15 { // Intersection of 2 arrays
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr2 = {7, 3, 4};
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr2.length; j++) {
				if (arr2[j] == arr[i]) {
					System.out.println(arr[i]);
					System.exit(0);
				}
			}
		}
		System.out.println("No Intersection");
	}
}
