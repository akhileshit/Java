import java.util.Scanner;

public class PatternsForLoop04 {
	
//	12345
//	12345
//	12345
//	12345
//	12345


	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		//Loop for repeating in rows
		for(int i=1; i<=n; i++) {
			//Loop for repeating in columns
			for(int j=1; j<=n; j++) {
				System.out.print(j);  //Prints corresponding value of column
			}
			//going to nextline for printing next row(hence it is inside outer loop)
			System.out.println();
		}
		scan.close();

	}

}
