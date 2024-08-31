import java.util.Scanner;

public class NumberManipulation01 { // Find wheather the given no. is +ve or -ve

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		
		if(n>0)
			System.out.println(n+" is positive number");
		else if(n<0)
			System.out.println(n+" is negative number");
		else
			System.out.println(n+" is zero");
		
		scan.close();

	}

}
