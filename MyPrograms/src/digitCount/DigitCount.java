package digitCount;
import java.util.Scanner;

public class DigitCount { // Sum of Digits

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number");
		int n = sc.nextInt();
		
		int i=n, sum=0;
		while(i>0) {
			
			sum += i%10;
			i = i/10;
			
		}
		System.out.println("Sum of digits: " + sum);
		sc.close();
	}
	
}
