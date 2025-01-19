import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your firstname ");
		String word= scan.next(); // we press "Enter key" after typing firstName
		System.out.println("Your firstname is: "+word);
		
		scan.nextLine(); //to read Enter
		
		System.out.println("Enter your Full name ");
		// or here
		String sentence= scan.nextLine(); // to read the sentence
		System.out.println("Your Full Name is: "+sentence);

	}

}
