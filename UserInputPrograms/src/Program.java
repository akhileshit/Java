import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age");
		byte age = scan.nextByte();
		
		System.out.println("Enter the year");
		short year = scan.nextShort();
		
		System.out.println("Enter the Salary");
		int salary = scan.nextInt();
		
		System.out.println("Enter your phone number");
		long phone = scan.nextLong();
		
		//output
		System.out.println("Your age is: "+ age);
		System.out.println("Year is: "+ year);
		System.out.println("Your salary is: "+ salary);
		System.out.println("Your Phone number is: "+ phone);
		scan.close();
			

	}

}
