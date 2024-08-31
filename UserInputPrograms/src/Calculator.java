import java.util.Scanner;

public class Calculator {
	// Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		add();
		//for subtraction
		double num1, num2;
		System.out.println("Enter 1st no. for Subtraction");
		num1= scan.nextDouble();
		System.out.println("Enter 2nd no. for Subtraction");
		num2= scan.nextDouble();
		sub(num1,num2);
		//for multiplication
		double num3, num4;
		System.out.println("Enter 1st no. for Multiplication");
		num3= scan.nextDouble();
		System.out.println("Enter 2nd no. for Multiplication");
		num4= scan.nextDouble();
		double multiplication = mul(num3, num4);
		System.out.println("Multiplication Result: "+multiplication);
		//for division
		double division = div();
		System.out.println("Division Result: "+division);
	}
	
	// Addition (Type 1)
	public static void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st no. for Addition");
		double num1= scan.nextDouble();
		System.out.println("Enter 2nd no. for Addition");
		double num2= scan.nextDouble();
		double sum= num1+num2;
		System.out.println("Addition Result: "+sum);	
	}
	
	// Subtraction (Type 2)
	public static void sub(double num1, double num2) {
		double difference= num1-num2;
		System.out.println("Subtraction Result: "+difference);
	}
	
    //	Multiplication (Type 4)
	public static double mul(double num1, double num2) {
		double multiply= num1*num2;
		return multiply;	
	}
	
	// Division (Type 3)
	public static double div() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st no. for Division");
		double num1= scan.nextDouble();
		System.out.println("Enter 2nd no. for Division");
		double num2= scan.nextDouble();
		double divide= num1/num2;
		return divide;	
	}
	

}
