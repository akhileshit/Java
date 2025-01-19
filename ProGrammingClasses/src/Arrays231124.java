
public class Arrays231124 { // Quick Sort          Pending... draw and solve
	public static void main(String[] args) {
		int arr[] = {5, 9, 2,-2, -5, 0};
		mergeSort(arr);
		
	}
	
	public static int[] mergeSort(int[] arr) {
		int pivot = arr[arr.length-1];
		int[] arr1 = new int[arr.length];
		return fill(arr, arr1, pivot);
			
	}
	
	public static int[] fill(int[] arr, int[] arr1, int pivot) {
		int j=0;
		int k=arr.length-1;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < pivot) {
				arr1[j] = arr[i];
				j++;
			}
			else if (arr[i] >= pivot) {
				arr1[k] = arr[i];
				k--;
			}
		}
		arr1[j] = pivot;
		
		return arr1;
	}
}
