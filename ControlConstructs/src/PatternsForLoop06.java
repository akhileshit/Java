import java.util.Scanner;

public class PatternsForLoop06 {
	
//	*****
//	****
//	***
//	**
//	*

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for( int j=5; j>=i; j--) {     //(or) for(int j=1; j<=n-i+1; j++)
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();

	}

}
