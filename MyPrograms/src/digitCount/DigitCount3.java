package digitCount;
import java.util.Scanner;

public class DigitCount3 { // Smallest Digit in a Number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number");
		int n = sc.nextInt();
		
		int i=n, k=0, min=10;
		while(i>0) {
			
			k = i%10;
			if (min > k) 
				min = k;
			i = i/10;
			
		}
		System.out.println("Smallest Digit: " + min);
		sc.close();
	}

}
