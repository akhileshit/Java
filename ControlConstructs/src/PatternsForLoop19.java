import java.util.Scanner;

public class PatternsForLoop19 {
	
//	*
//	**
//	* *
//	*  *
//	*****

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if((i>=3 && i<=n-1) && (j>=2 && j<=i-1)){
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
			scan.close();

		}

	}

}
