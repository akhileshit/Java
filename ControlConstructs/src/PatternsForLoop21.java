import java.util.Scanner;

public class PatternsForLoop21 {
	
//	-----*
//	----* *
//	---*   *
//	--*     *
//	-*       *
//	--*     *
//	---*   *
//	----* *
//	-----*

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		
		//outer for loop1 : 5 rows
		for(int i=1;i<=n; i++) { 
			for(int j=1; j<=n-i+1; j++) { //inner for loop1 : (n-i+1) columns
				System.out.print("-");
			}
			for(int j=1; j<=2*i-1; j++) { //inner for loop2 : (2*i-1) columns
				if(  (i>=2)  &&  (j>1 && j<2*i-1)  ) { //Tells where to print spaces
					System.out.print(" ");
				}
				else
					System.out.print("*"); 
			}
			System.out.println(); //Go to next Line
		
		}
		
		//outer for loop2 : 4 rows
		for(int i=2;i<=n; i++) { 
			for(int j=1; j<=i; j++) { //inner for loop1 : i columns
				System.out.print("-");
			}
			for(int j=1; j<=2*(n-i+1)-1; j++) { //inner for loop2 : 2*(n-i+1)-1 columns
				if(  (i>=2 && i<=n-1)  &&  (j>1 && j<2*(n-i+1)-1)  ) { //Tells where to print spaces
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println(); //Go to next Line
		
		}
		scan.close();
	}

}
