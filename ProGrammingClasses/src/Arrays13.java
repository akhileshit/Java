
public class Arrays13 { // Average of all the elements in an array
	public static void main(String[] args) {
		int[] arr = {2, 3, 9, 1, 2};
		double sum =0.0;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		double avg = sum/arr.length;
		System.out.println("Average: " + avg);
		System.out.println("Sum: " + sum);
		
	}
}
