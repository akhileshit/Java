import java.util.Scanner;

public class NumberManipulation11 { // Print N Fibonacci series

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt(); // Taking input from the user
		scan.close();
		
		int num1=0, num2=1, res;
		System.out.print("Fib series: ");
		if(n<=0)
			System.out.println("Invalid n value");
		else if(n==1) // If n=1
			System.out.println("0");
		else if(n==2) // If n=2
			System.out.println("0 1");
		else { // Otherwise
			System.out.print("0 1 "); // Hardcoding the 1st 2 values
			// Finding fibonacci series
			for(int i=0; i<n-2; i++) { 
				res=num1+num2; // calculate next value and store in res
				num1=num2;
				num2=res;
				System.out.print(res);
				System.out.print(" ");
			}
		}
	}
}
