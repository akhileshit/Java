import java.util.Scanner;

public class NumberManipulation12 { // Reversing the Given number

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		scan.close();
		reverseNum(n); // Call method to reverse the number
	}
	
	public static void reverseNum(int n) {
		int i=n;
		while(i>0) { // The condition i>0 is Redundant*
			if(i/10>0) {
				int j=i%10; // Extracting last digit
				i=i/10; // Removing printed digit(last digit)
				System.out.print(j); // Printing the extracted last digit
			}
			else { // i/10==0
				System.out.print(i);
				break;
			}		
		}
	}

}
//* becaz i and i/10 are =0 from 1 to 9  
// so instead put i/10>0 inside while and remove if-else.
// programs 8,9,10&12 are almost same--> works on extract and remove concept