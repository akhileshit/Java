import java.util.Scanner;

public class SimpleIf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age= scan.nextInt();
		if(age>=18) {
			System.out.println("Adult");
		}
		scan.close();
	}

}
