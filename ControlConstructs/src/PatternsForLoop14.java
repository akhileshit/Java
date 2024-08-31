import java.util.Scanner;

public class PatternsForLoop14 {
	
//	-----*
//	-----**
//	-----***
//	-----****
//	-----*****
//	-----****
//	-----***
//	-----**
//	-----*

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		
		
		
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("-");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		for(int k=1;k<=(n-1); k++) {
			for(int j=1; j<=(n); j++) {
				System.out.print("-");
			}
			for(int j=1; j<=(n-1)-k+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();

	}

}
