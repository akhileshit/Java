import java.util.Scanner;

public class NumberManipulation17 { // Prime or not

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the n value");
		int n= scan.nextInt();
		scan.close();
		primeOrNot(n);

	}
	
	public static void primeOrNot(int n) {
		if(n<=1) {
			System.out.println("The no. shd be >=1 ");
			return;
		}
		int i=2;
		while(i>1 && i<=n/2 ) {
			if(n/i==0) {
				System.out.println("Not a prime");
				break;
			}
			else
				i++;
		}
		System.out.println("Yes it is prime!!");
	}
}
