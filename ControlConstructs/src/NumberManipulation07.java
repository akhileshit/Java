import java.util.Scanner;

public class NumberManipulation07 {  // Count the #digits in a Given number

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		scan.close();
		
		int counter=0;
		int i=n; // init
		while(i>0) { // condition
			i=i/10;  // update
			counter++;
		}
		System.out.println("The number "+n+" has "+counter+" digits.");
		
	}

}
