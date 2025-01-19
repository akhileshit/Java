package collections01;

public class Array {
	private int[] arr;
	
	public Array(int size) {
		arr = new int[size];
		System.out.println("Array of size " + arr.length + " created.");
	}
	
	public void insert(int index, int e) {
		if (index>=0 && index<arr.length) {
			arr[index] = e;
		}
		else {
			System.out.println("Enter the index from 0 to " + (arr.length-1));
		}
	}
	
	public void delete(int index) {
		if (index>=0 && index<arr.length) {
			arr[index] = 0;
		}
		else {
			System.out.println("Enter the index from 0 to " + (arr.length-1));
		}
	}
	
	public void display() {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int search(int[] arr, int key) {
		sort(arr);
		int low=0, high=arr.length-1, mid=0;
		while (low <= high ) {
			mid = (low+high)/2;
			
			if (key == arr[mid]) {
				return mid;
			}
			
			else if (key < arr[mid]) {
				// ignore right half
				high = mid-1;
			}
			
			else {
				// ignore left half
				low = mid+1;
			}
		}
		return -1;
	}
	
	public void sort(int[] arr) {
		int min=0, minIndex=0;
		for (int i=0; i<=arr.length-2; i++) {
			min = arr[i];
			minIndex = i;
			for (int j=i+1; j<=arr.length-1; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			// Swap
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	

}
