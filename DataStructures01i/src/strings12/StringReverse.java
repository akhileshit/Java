package strings12;

//CLASS WRITTEN TO REVERSE THE STRING
public class StringReverse { 
	
	public static String reverse(String s) {
		char []arr = s.toCharArray(); // Converting String to Character Array
		char [] arr2 = new char[arr.length]; // Using another Array
		
		int j = arr.length -1 ;
		for (int i=0; i<arr.length; i++) {
			arr2[j] = arr[i];
			j--;
		}
		
		String str = new String(arr2); // Character Array to String!!!
		
		if (str.equalsIgnoreCase(s))
			System.out.println("The given string is Palindrome!!");
		else
			System.out.println("The given string is NOT Palindrome");
			
		return str;
	}
	
}
