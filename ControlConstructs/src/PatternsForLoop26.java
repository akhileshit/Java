import java.util.Scanner;

public class PatternsForLoop26 {
	
//	01 03 05 07 
//	02 04 06 08 
//	09 11 13 15 
//	10 12 14 16 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = scan.nextInt();
		scan.close();
		
		int odd=0, even=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i%2==0) { // for even rows
					if(2*even < 10) { // for single digit no.s
						System.out.print("0");
					}
					System.out.print(2*even);
					System.out.print(" ");
					even++;
				}
				else { // for odd rows
					if(2*odd+1 < 10) { // for single digit no.s
						System.out.print("0");
					}
					System.out.print(2*odd+1);
					System.out.print(" ");	
					odd++;
				}	
			}
			System.out.println(); // next row, new line
		}
	}
}
