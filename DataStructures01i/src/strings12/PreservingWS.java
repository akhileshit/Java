package strings12;

// CLASS WRITTEN TO PRESERVE SPACES AND REVERSE THE STRING/SENTENCE
public class PreservingWS { 
	
	public static String revPWS(String s) {		
		char []arr1 = s.toCharArray(); // String to Char Array
		char []arr2 = new char[arr1.length];
		
		// Copying spaces...(preserving spaces)
		for (int i=0; i<arr1.length; i++) {
			if (arr1[i] ==  ' ') 
				arr2[i] = ' ';
		}
		
		// Logic for reversing after preserving spaces
		int j = arr1.length -1;
		for (int i=0; i<arr1.length; i++) {
			if (arr1[i] != ' ') {
				if (arr2[j] == ' ') {
					j--;	
				}
				arr2[j] = arr1[i];
				j--;
			}	
		}
		
		String str = new String(arr2); // Char Array to String
		return str;
	}
}
