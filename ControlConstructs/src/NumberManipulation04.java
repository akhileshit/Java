import java.util.Scanner;

public class NumberManipulation04 { // Check wheather the given character is vowel or consonant or a number

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the character");
		char c= scan.next().charAt(0);
		
		//Checking wheather the input is alphabet 
		if((c>='a' && c<='z'|| (c>='A') && c<='Z')) { 
			
			switch(c) { //Checking wheather the char is vowel
			case 'a','A', 'e','E', 'i','I', 'o','O', 'u','U' : System.out.println(c+ " is a vowel");
			break;
			default: System.out.println(c+ " is a consonant"); //Checking wheather the char is consonant
			}
		}
		//Checking wheather the input is number 
		else
			System.out.println(c+" is not a valid alphabet character");
		
		scan.close();
	}

}
