import java.util.Scanner;

public class PatternsForLoop11 {
	
//	11111
//	222212
//	3333123
//	44441234

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i);
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scan.close();

	}

}
