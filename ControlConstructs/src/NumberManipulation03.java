import java.util.Scanner;

public class NumberManipulation03 { // Print the seasons for a given month no. .

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number(1 to 12)");
		int month= scan.nextInt();
		
		switch(month) {
			case 12:
			case 1:
			case 2: System.out.println("The month number "+month+" corresponds to Winter");
				break;
			case 3:
			case 4:
			case 5: System.out.println("The month number "+month+" corresponds to Spring");
				break;	
			case 6:
			case 7:
			case 8: System.out.println("The month number "+month+" corresponds to Summer");
				break;
			case 9:
			case 10:
			case 11: System.out.println("The month number "+month+" corresponds to Fall");
				break;
			default: System.out.println("The month number "+month+" corresponds to Invalid month number");
		}
		scan.close();
	}

}
