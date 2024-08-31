import java.util.Scanner;

public class NumberManipulation08 { // Finding Sum of digits of a Given no. 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		scan.close();
		
		int sum=0;
		int i=n; //221,22
		int j;
		while(i>0) {
			if(i>=10) {
				j=i%10;// 1,2   Captures the last digit
				i=i/10;//22,2   Removes the last digit
			}
			else { // For handling the last remaining digit of a number. hence(i<10).
				sum=sum+i; // 5   'i' value is captured as-it-is if i<10 (edge-case)
				break; // i<10 implies, it's the last digit. So the above line directly adds it up then we break.
			}
			sum=sum+j; //1,3    Adding-up the captured last digits
		}
		System.out.println("The sum of digits of "+n+" is "+sum);
	}

}
// programs 8,9,10&12 are almost same--> works on extract and remove concept