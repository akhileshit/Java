import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the User Id (byte)");
		byte userId= scan.nextByte();
		System.out.println("Enter your age (short)");
		short age= scan.nextShort();
		System.out.println("Enter your phone number(Start with 1) (int)");
		int phone= scan.nextInt();
		System.out.println("Enter your national Id (long)");
		long NId= scan.nextLong();
		System.out.println("Enter your height meters (float)");
		float height= scan.nextFloat();
		System.out.println("Enter your weight in kg (double)");
		double weight= scan.nextDouble();
		System.out.println("Enter your gender(M/F) (Char)");
		char gender= scan.next().charAt(0);
		System.out.println("Are you Married(true/false) (boolean)");
		boolean isMarried= scan.nextBoolean();
		System.out.println("Enter your full name (String)");
		scan.nextLine();
		String name= scan.nextLine();
		
		System.out.println("UserId: "+userId);
		System.out.println("Age: "+age);
		System.out.println("PhoneNumber: "+phone);
		System.out.println("NationalId: "+NId);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
		System.out.println("Gender: "+gender);
		System.out.println("MarriedStatus: "+isMarried);
		System.out.println("Name: "+name);

	}

}
