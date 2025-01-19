import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two strings for Anagram check");
		String str1 = scan.next().toLowerCase();
		String str2 = scan.next().toLowerCase();
		
		// If Lengths are not equal
		if(str1.length() != str2.length()) {
			System.out.println("Not Anagrams!");
			scan.close();
			return ;
		}
		
		// String to charArray
		char [] arr1 = str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		
		// Sort charArray
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		// Convert back to string
		str1 = new String(arr1);
		str2 = new String(arr2);
		
		if (str1.equals(str2)) {
			System.out.println("Yesss Anagrams");
		}
		else 
			System.out.println("Not Anagrams");
		
		scan.close();
	}
}
