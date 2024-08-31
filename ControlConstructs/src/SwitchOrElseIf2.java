import java.util.Scanner;

public class SwitchOrElseIf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Gender(M/F)");
		char gender= scan.next().charAt(0);
		System.out.println("Enter the marks");
		int marks= scan.nextInt();
		int cgpa= marks/10;
		validateCgpa(cgpa);
		printRemarks(cgpa, gender);
		scan.close();

	}
	public static void validateCgpa(int cgpa) {
		if(cgpa>10 || cgpa<0) {
			System.out.println("Invalid marks");
		}
		else
			System.out.println("CGPA: "+ cgpa);
		
	}
	public static void printRemarks(int cgpa, char gender) {
		// For Male 
		if(gender=='M') {
			switch (cgpa) {
			case 0: 
			case 1: System.out.println("Get Lost"); break;
			case 2: 
			case 3: 
			case 4: System.out.println("Poor"); break;
			case 5: System.out.println("Ok"); break;
			case 6:
			case 7: System.out.println("Good"); break;
			case 8: 
			case 9: 
			case 10: System.out.println("Excellent"); break;
			
			default: System.out.println("Invalid CGPA");
			}
		}
		
		// For Female
		else if (gender=='F') {
			switch (cgpa) {
			case 0: 
			case 1: System.out.println("Poor"); break;
			case 2: System.out.println("Ok"); break;
			case 3: 
			case 4: System.out.println("Good"); break;
			case 5: 
			case 6: System.out.println("Very Good"); break;
			case 7: 
			case 8: 
			case 9: 
			case 10: System.out.println("Excellent"); break;
			
			default: System.out.println("Invalid CGPA");
			}
		}
		
		// Invalid Gender
		else
			System.out.println("Provide Valid value for Gender");
		
		
	}

}
