import java.util.Scanner;

public class JumbleWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String jumbledWord = "";
		
		int i=0, j=0;
		while (i<str1.length() && j<str2.length()) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(j);
			
			//Check if both characters are vowels
//			if (isVowel(ch1) && isVowel(ch2)) {
//				jumbledWord += ch1;
//				jumbledWord += ch2;
//				i++;
//				j++;
//			} else if (isVowel(ch1)) {
//				jumbledWord += ch1;
//				i++;
//			} else if (isVowel(ch2)) {
//				jumbledWord += ch2;
//				j++;
//			} else {
				jumbledWord += ch1;
				jumbledWord += ch2;
				i++;
				j++;
//			}
		}
		
		//Append remaining characters from str1 and str2, if any
		while (i < str1.length()) {
			jumbledWord += str1.charAt(i);
			i++;
		}
		
		while (j < str2.length()) {
			jumbledWord += str2.charAt(j);
			j++;
		}
		
		System.out.println(jumbledWord);
	}
	
	static boolean isVowel(char ch) {
		return "AEIOUaeiou".indexOf(ch) != 1;
	}
}
