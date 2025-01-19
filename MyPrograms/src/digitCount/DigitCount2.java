package digitCount;
import java.util.Scanner;

public class DigitCount2 { // Sum of Odd and Even Digits

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number");
		int n = sc.nextInt();
		
		int i=n, k=0, evenSum=0, oddSum=0;
		while(i>0) {
			
			k = i%10;
			if (k%2 == 0) 
				evenSum += k;
			else
				oddSum += k;
			
			i = i/10;
				
		}
		System.out.println("Sum of Odd Digits: " + oddSum);
		System.out.println("Sum of Even Digits: " + evenSum);
		sc.close();
	}

}
