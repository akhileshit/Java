import java.util.Scanner;

public class NumberManipulation05 { //Even numbers between/in the given range

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the 1st number of Range");
		int m= scan.nextInt();
		System.out.println("Enter the 2nd number of Range");
		int n= scan.nextInt();
		
		if(m>n)
			System.out.println("m value should be greater than n");
		else {
			for (int i=m; i<=n; i++) {
			if(i%2==0) {      // Checks wheather the no. is even or not
				System.out.print(i);
				if(i<n-1)
					System.out.print(", "); // doesn't print ',' after the last no.
			}
			
		}
		}
		
		scan.close();
	}

}
