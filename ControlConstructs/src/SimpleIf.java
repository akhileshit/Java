import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks= scan.nextInt();
		if(marks>=35) {
			System.out.println("Student is passed");
		}
		scan.close();
	}

}
