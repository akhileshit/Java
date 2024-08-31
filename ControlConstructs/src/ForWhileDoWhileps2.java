import java.util.Scanner;

public class ForWhileDoWhileps2 {  // PRODUCT OF NUMBERS FROM N1 TO N2

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the 1st no.");
		int num1= scan.nextInt();
		System.out.println("Enter the 2nd no. greater than "+num1);
		int num2= scan.nextInt();
		if(num1<num2) {
			int prod=1;
			for (int i=num1;i<=num2; i++) {
				prod=prod*i;
			}
			System.out.println("The product of numbers form "+num1+ " to "+num2 +" is: "+prod);
		}
		else
			System.out.println("Invalid Numbers");
		scan.close();
	}

}
