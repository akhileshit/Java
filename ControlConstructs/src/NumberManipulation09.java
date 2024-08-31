import java.util.Scanner;

public class NumberManipulation09 { // find count of even digits and odd digits in a number
	static int countEven=0, countOdd=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		scan.close();
		parseDigits(n);
		System.out.println("# Even digits in "+n+" = "+countEven);
		System.out.println("# Odd digits in "+n+" = "+countOdd);
	}
	
	public static void parseDigits(int n) {
		int i=n, j;
		while(i/10>0) {
			j=i%10; // Capture Last Digit
			i=i/10; // Remove Last Digit
			countEvenOdd(j);
		}
		if(i/10==0) {
			countEvenOdd(i);
		}
	}
	
	public static void countEvenOdd(int digit) {
		if(digit%2==0) {
			countEven++;
		}
		else
			countOdd++;
	}
}
