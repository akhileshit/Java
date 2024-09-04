import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for palindrome check");
		int n = scan.nextInt();
		scan.close();
		
		String isPalindrome = isPalindrome(n);
		System.out.println("Palindrome Check: " + isPalindrome);
		
	}
	
	public static String isPalindrome(int n) {
		int i=n, j=0, k=0 ;          // for while loop, i is initialized, condt'n checked & updated
		while(i > 0) {
			j = i%10; // extract last digit
			i = i/10; // remove last digit
			k = k*10 + j; 
		}
		
		System.out.println("Reversed Number:" + k);
		if(k == n) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
