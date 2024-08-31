import java.util.Scanner;

public class NumberManipulation14 { // Check For Palindrome Number

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the n value");
		long n= scan.nextLong();
		scan.close();
		palindromeChecker(n);
	}
	
	public static void palindromeChecker(long n) {
		long j, i=n, reverse=0;
		while(i>0) {
			j= i%10;
			i= i/10;
			reverse= reverse*10 + j;
		}
		if(reverse==n) 
			System.out.println("Yes it's a Palindrome!!!");
		else
			System.out.println("No, it is not a Palindrome!");
		System.out.println(reverse);
	}

}
