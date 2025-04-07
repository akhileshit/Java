import java.util.TreeSet;

public class GetKSmallestElements1 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		int arr[] = {1,5,3,4,7,6,2,9,8};
		int k = 3;
		
		for (int i : arr) {
			ts.add(i);
		}
		
//		System.out.println(ts);
		for (int i=0; i<k; i++) {
			System.out.println(ts.removeFirst());
		}
		
		
	}
}


