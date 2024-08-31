//importing Scanner class to take userinput
import java.util.Scanner;

public class ForWhileDoWhileps4 {  // TABLES OF A GIVEN NUMBER

	//Writing main method for jvm to find
	public static void main(String[] args) {
		//Creating object of Scanner class
		Scanner scan= new Scanner(System.in);
		//Asking user to Enter the table number required
		System.out.println("Enter the Table number");
		//Storing input from the user in variable n
		int n= scan.nextInt();
		//creating iteration from 1 to 10 using for loop (logic)
		for(int i=1; i<=10; i++) {
			System.out.println(n+" x "+i+" = "+n*i); //printing i values multiplied with the n value in tables format
		}
		scan.close();
	}

}
