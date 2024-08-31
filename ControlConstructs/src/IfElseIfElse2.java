import java.util.Scanner;

public class IfElseIfElse2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num= scan.nextInt();
		if(num <0) {
			System.out.println("Negative");
		}
		else if(num>0) {
			System.out.println("Positive");
		}
		else{
			System.out.println("Zero");}
		
		scan.close();

	}

}
