package algos08;

public class SearchSortApp {
	// **************************************************
	static int linearSearch(int[] arr, int key) {
		for (int i=0; i<=arr.length-1; i++) {
			if (arr[i] == key) {
				return i+1;
			}
		}
		return -1;
	}
	// **************************************************	
	static int binarySearch(int[] arr, int key) {
		int low=0, high=arr.length-1, mid=0;
		while(low<=high) {
			mid = (low+high)/2;
			
			if (key == arr[mid]) {
				return mid+1;
			}
			
			else if(key > arr[mid]) {
				low = mid+1;
			}
			
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	// **************************************************	
	static void bubbleSort(int[] arr) {
		for (int i=0; i<=arr.length-2; i++) {
			boolean swap = false;
			for (int j=0; j<=arr.length-2-i; j++) {
				if (arr[j] > arr[j+1]) {
					// Swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if (!swap) break; // early-exit
		}
	}
	// **************************************************
	static void selectionSort(int[] arr) {
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
	// **************************************************
	static void insertionSort(int[] arr) {
		int item=0;
		for (int i=1; i<=arr.length-1; i++) {
			item = arr[i];
			int j = i-1;
			while (j>=0 && arr[j] > item) {
				// Push
				arr[j+1] = arr[j];
				j--;
			}
			// Insert
			arr[j+1] = item;
		}
	}
	// **************************************************
}
