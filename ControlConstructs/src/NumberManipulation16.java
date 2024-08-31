import java.util.Scanner;

public class NumberManipulation16 { // Find GCD of 2 numbers

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the n1 value");
		int num1= scan.nextInt();
		System.out.println("Enter the n2 value");
		int num2= scan.nextInt();
		scan.close();
		gcd(num1, num2);

	}
	
	public static void gcd(int num1, int num2) {
		int i=num1, j=num2, rem;
		while(j!=0) {
			rem=i%j;
			i=j;
			j=rem;
		}
		System.out.println("GCD: "+i);
	}

}
