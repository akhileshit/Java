import java.util.Scanner;

public class PatternsForLoop25 {
	
//	A
//	AB
//	ABC
//	ABCD
//	2
//	44
//	666
//	8888

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=n; i++) {
			for(char j='A'; j<=i+64; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i*2);
			}
			System.out.println();
		}
	}

}
