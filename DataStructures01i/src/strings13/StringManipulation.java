package strings13;

import java.util.Scanner;

public class StringManipulation { // Reverse each string/word in the sentence
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence to reverse:");
		String s = scan.nextLine();
		System.out.println("Original Sentence: " + s);
		
		String arr[] = s.split(" "); 

		String revSentence = "";
		for (int i=0; i<arr.length; i++) {
			String rw = StringOperations.revEachWord(arr[i]); // i written function revEachWord()
			revSentence = revSentence + " "+  rw;
		}
		
		System.out.println("Reversed Sentence:" + revSentence);
		scan.close();
	}
}
