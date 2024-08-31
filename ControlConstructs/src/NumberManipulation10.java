import java.util.Scanner;

public class NumberManipulation10 { // Finding smallest digit in a Given number

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		scan.close();
		smallOfDigits(n); // Calling the method to find the smallest digit
	}
	
	// Method for finding smallest digit:
	public static void smallOfDigits(int n) {
		// Handles -ve no. case (n<0) ----------------------------------
		if(n<0) {
			System.out.println("Invalid number");
			return; // Come out of this method
		}

		// Handles all cases but last remaining digit -------------------------
		int i=n, k=10, j;  // Since all compared here are 1-digit, k value is taken as 2-digits(acts as infinity)
		
		while(i/10>0) { //424,42,4  
			j=i%10; //4,2   // Stores remainder(last digit) of a number
			i=i/10; //42,4  // Removes last digit of a number
			if(k>j) {  // Compares the extracted digit with the upcoming digits
				k=j; //4,2  // Assigns the smaller digit to k 
			}
		}
		
		// Handles edge case (last remaining digit after continuous divisions)----------------------
		if(i/10==0) { // Handles the last remaining digit of a number (which shd be < 10)-->(hence i/10==0)
			if(k>i) // Checks wheather the last remaining digit(=i) is smaller than recent k value
				k=i; // Assigns 'i'value to k if the lastDigit(i) is even smaller
		}
		System.out.println("The smallest digit in the no. "+n+" is "+k); // Finally printing the smallest value stored in k	

		
		
        // Redundant programming:	
//		if(n==0) {
//		System.out.println("The smallest digit in the no. is "+n);
//		return;
//		}
		
//		while(i>0) { //424,42,4  
//			if(i>=10){
//				j=i%10; //4,2   // Stores remainder(last digit) of a number
//				i=i/10; //42,4  // Removes last digit of a number
//				if(k>j) {  // Compares the extracted digit with the upcoming digits
//					k=j; //4,2  // Assigns the smaller digit to k 
//				}
//			}
//			else {
//				if(k>i) { // Handles the last remaining digit of a number (which shd be < 10)
//					k=i; // Assigns the 'i' to k if the lastDigit(i) is even smaller
//					break; // Coming out of the while loop (since all the digits in the given no. are handled)
//				}
//				break; // Coming out of the while loop (if k is not > i)
//			}
//		}
//		System.out.println("The smallest digit in the no. "+n+" is "+k); // Finally printing the smallest value stored in k
	}
}

	


