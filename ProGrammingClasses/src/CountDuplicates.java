import java.util.HashMap;

public class CountDuplicates {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		int arr[] = {1, 3, 4, 1, 0, 7, 1, 3, 7, 0, 5, 6};
		
		for (int i : arr) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			}
			else {
				
			}
		}
	}
}
