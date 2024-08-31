import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Height");
		float height= scan.nextFloat();
		
		System.out.println("Enter your acc Balance");
		double balance= scan.nextDouble();
		
		System.out.println("Are you Married? (true/flase)");
		boolean married= scan.nextBoolean();
		
		System.out.println("Your height is: "+height);
		System.out.println("Your Account Balance is: "+balance);
		System.out.println("Your married status: "+married);
		
		}


}


