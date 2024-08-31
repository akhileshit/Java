import java.util.Scanner;

public class NumberManipulation19 { // Nth term of the series 1,3,6,10,15,21,.....

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the n value");
		int n= scan.nextInt();
		scan.close();
		
		nthTerm(n);
	}
	
	public static void nthTerm(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			count=count+i;
		}
		System.out.println("The "+n+"th "+"term of the series is "+count+".");
	}

}
