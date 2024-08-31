import java.util.Scanner;

public class PatternsForLoop03 {
	
//	11111
//	22222
//	33333
//	44444
//	55555

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i);  //Prints corresponding value of row
			}
			System.out.println();
		}
		scan.close();
	}

}
