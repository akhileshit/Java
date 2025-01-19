package strings13;

public class StringOperations {
	static String revEachWord(String s) {
		char arr[] = s.toCharArray();
		char arr2[] = new char[arr.length];
		
		int j = arr2.length -1;
		for (int i=0; i<arr.length; i++) {
			arr2[j] = arr[i];
			j--;
		}
		
		String rev = new String(arr2);
		
		return rev;
		
	}
}

// many other ways to reverse a string:
// - using charAt(), until str.length() and for loop method
// - using stringBuilders reverse() method
// - using strings reverse() method (NO there in no reverse() methods in strings since its immutable)
