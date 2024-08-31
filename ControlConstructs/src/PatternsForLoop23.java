import java.util.Scanner;

public class PatternsForLoop23 {
	
//	 1 
//	 2  3 
//	 4  5  6 
//	 7  8  9 10 

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n= scan.nextInt();
		
		int num=1;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) { //
				if(num>=1 && num<=9) {
					System.out.print(" "+num+" ");
					num++;
				}
				else {
					System.out.print(num+" ");
					num++;
				}
				
			}
			System.out.println();
		}
		scan.close();
	}
}
