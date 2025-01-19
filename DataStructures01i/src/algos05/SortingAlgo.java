package algos05;

public class SortingAlgo {
	
	Employee[] bubbleSort(Employee[] arr) {
		for (int i=0; i<=arr.length-2; i++) {
			Boolean swap = false;
			for (int j=0; j<=(arr.length)-2-i; j++) {
				if (arr[j].getName().charAt(0) > arr[j+1].getName().charAt(0)) {
					//Swap
					Employee temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if (!swap) break;
		}
		return arr;
	}
}
