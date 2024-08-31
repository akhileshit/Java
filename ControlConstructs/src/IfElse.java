import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender(m/f)");
		char gender= scan.next().charAt(0);
		if(gender == 'm') {
			System.out.println("Male");
		}
		else {
			System.out.println("Female");
		}
		scan.close();
	}
}
