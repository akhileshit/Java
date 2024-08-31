import java.util.Scanner;

public class ForWhileDoWhileps {  //SUM OF FIRST N NATURAL NUMBERS

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
			
			//Using for loop
//		int sum=0;
//		for(int i=1; i<=n; i++) {
//			sum=sum+i;
//		}
//		System.out.println("Sum of "+n + " Natural numbers is: "+sum);
		
			//Using while
//		int i=1, sum=0;
//		while(i<=n) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println("Sum of "+n + " Natural numbers is: "+sum);
		
			//Using do-while
		int i=1, sum=0;
		do {
			sum=sum+i;
			i++;
		}
		while(i<=n);
		System.out.println("Sum of First "+n + " Natural numbers is: "+sum);
		scan.close();
	}

}
