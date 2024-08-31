import java.util.Scanner;

public class ForWhileDoWhileps3 {      // FACTORIAL OF A NUMBER

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println(n+"! = "+fact);
		
//		int fact=1;
//		int i=1;
//		while(i<=n) {
//			fact=fact*i;
//			i++;
//		}
//		System.out.println(n+"! = "+fact);
		
		int fact=1;
		int i=1;
		do {
			fact=fact*i;
			i++;
		}
		while(i<=n);
		System.out.println(n+"! = "+fact);
		scan.close();
	}

}
