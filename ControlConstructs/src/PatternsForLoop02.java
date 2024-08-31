import java.util.Scanner;

public class PatternsForLoop02 {
	
//	@@@@@@@@
//	@@@@@@@@
//	@@@@@@@@
//	@@@@@@@@
//	@@@@@@@@

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m= scan.nextInt();
		System.out.println("Enter the number columns");
		int n= scan.nextInt();
		System.out.println("Enter the character to be printed");
		char c= scan.next().charAt(0);
		for (int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(c);
			}
			System.out.println("");
		}
		scan.close();

	}

}
