import java.util.Scanner;

public class NumberManipulation13 { // Print Nth term of fibonacci series

	public static void main(String[] args) { 
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the n value");
		long n= scan.nextLong();
		scan.close();
		findNthFibonacci(n);
	}

	public static void findNthFibonacci(long n) {
		long num1=0, num2=1, fib=0;
		if(n==1) {
			System.out.println(n+"st Fibonacci term is: "+num1);
			return;
		}	 
		else if(n==2) {
			System.out.println(n+"nd Fibonacci term is: "+num2);
			return;
		}	 
		else if(n<=0){
			System.out.println("Invalid n value");
			return;
		}
		else {
			for(long i=1; i<=n-2; i++) { //Fibonacci Logic
				fib= num1+num2;
				num1= num2;
				num2= fib;
			}
			System.out.println(n+"th Fibonacci term is: "+fib);
		}
		
	}
}
