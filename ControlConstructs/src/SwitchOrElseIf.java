import java.util.Scanner;

public class SwitchOrElseIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks= scan.nextInt();
		int cgpa= marks/10;
		calculateCgpa(cgpa);
		printRemarks(cgpa);
		scan.close();

	}
	public static void calculateCgpa(int cgpa) {
		if(cgpa>10 || cgpa<0) {
			System.out.println("Invalid marks");
		}
		else
			System.out.println("CGPA: "+ cgpa);
		
	}
	public static void printRemarks(int cgpa) {
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
		
//		switch (cgpa) {
//		case 0: System.out.println("Get Lost"); break;
//		case 1: System.out.println("Get Lost"); break;
//		case 2: System.out.println("Poor"); break;
//		case 3: System.out.println("Poor"); break;
//		case 4: System.out.println("Poor"); break;
//		case 5: System.out.println("Ok"); break;
//		case 6: System.out.println("Good"); break;
//		case 7: System.out.println("Good"); break;
//		case 8: System.out.println("Excellent"); break;
//		case 9: System.out.println("Excellent"); break;
//		case 10: System.out.println("Excellent"); break;
//		default: System.out.println("Invalid CGPA");
//		}
		
	}

}
