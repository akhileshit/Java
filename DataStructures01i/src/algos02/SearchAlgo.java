package algos02;

public class SearchAlgo {
	int linearSearch(Employee[] arr, String k  ) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i].name.equals(k)) {
				return i;
			}
		}
		return -1;
	}
}
