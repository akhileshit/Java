import java.util.Scanner;

public class NumberManipulation06 { // Find Even and Odd no.'s and their sums separately

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the n value");
		int n= scan.nextInt();
		scan.close();
		
		even(n);
		System.out.println();
		odd(n);
	}
	
	// Method for even
	public static void even(int n) { 
		int sum_even=0;
		System.out.print("Even no.'s are: ");
		for (int i=1; i<=n; i++) {
			if(i%2==0) {      // Checks wheather the no. is even or not
				System.out.print(i);
				if(i<n-1)
					System.out.print(", "); // doesn't print ',' after the last no.
				sum_even= sum_even+i;
			}
		}
		System.out.println();
		System.out.println("Sum of even no.'s is: "+sum_even);
	}
	
	//Method for odd
	public static void odd(int n) {
		int sum_odd=0;
		System.out.print("Odd no.'s are: ");
		for (int i=1; i<=n; i++) {
			if(i%2!=0){      // Checks wheather the no. is odd or not
				System.out.print(i);
				if(i<n-1)
					System.out.print(", "); // doesn't print ',' after the last no.
				sum_odd= sum_odd+i;
			}
		}
		System.out.println();
		System.out.println("Sum of odd no.'s is: "+sum_odd);
	}

}
