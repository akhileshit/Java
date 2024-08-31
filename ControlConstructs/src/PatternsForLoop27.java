import java.util.Scanner;

public class PatternsForLoop27 {
	
//	A65 B66 C67 D68 
//	E69 F70 G71 H72 
//	I73 J74 K75 L76 
//	M77 N78 O79 P80 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = scan.nextInt();
		scan.close();
		
		char alpha = 'A';
		int num = 'A';
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(alpha);
				System.out.print(num + " ");
				alpha++;
				num++;
			}
			System.out.println();
		}
	}

}
