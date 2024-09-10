import java.util.Scanner;

public class MyCalculator extends Calculator {
	Scanner scan = new Scanner(System.in);
	String name = "Epson"; 
	
	void addition() {
		super.addition(); // super keyword - method
		System.out.println("Enter values for a & b:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Addition Result is " + (a+b));
	}
	
	void printName() {
		System.out.println(name);
		System.out.println(super.name); // super keyword - variable-hiding
	}
	
}
