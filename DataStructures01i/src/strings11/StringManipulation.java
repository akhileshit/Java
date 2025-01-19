package strings11;

import java.util.Scanner;
import strings12.PreservingWS; // IMPORT
import strings12.StringReverse; // IMPORT


public class StringManipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence to reverse:");
		String str = scan.nextLine();
		
		System.out.println("Original Sentence: " + str);
		String str2 = PreservingWS.revPWS(str); // REVERSES THE STRING/SENTENCE BY PRESERVING WHITESPACES (function written by me in different PACKAGE)
		System.out.println("Reversed Sentence: " + str2);
		
		
			
//			System.out.println("Enter the String to Reverse:");
//			String s = scan.next();
//			System.out.println("***********Original String: " + s);
//			String rs = StringReverse.reverse(s); // REVERSES THE GIVEN STRING (function written by me in different package)
//			System.out.println("Here's the Reversed String: " + rs);
			
		scan.close();
	}

}
