import java.util.Scanner;

public class PatternsForLoop24 { 
	
//	A
//	AB
//	ABC
//	ABCD
//	1
//	12
//	123
//	1234

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=n; i++) {
			for(char j='A'; j<=i+64; j++) { // more better approach below
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

//		char alpha= 'A';
//		for(int i=1; i<=n; i++) { // n rows
//			for(int j=1; j<=i; j++) { // i columns
//				System.out.print(alpha); // what to print?
//				alpha++;
//			}
//			alpha= 'A'; // Reset to A again
//			System.out.println();
//		}