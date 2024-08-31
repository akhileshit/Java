import java.util.Scanner;

public class AdvanceCalculator implements Calculator { // Implementing Calculator interface

	Scanner scan = new Scanner(System.in);
	
	int a , b;
	public void takeInput() {
		System.out.println("Name is AdvanceCalci");
		System.out.println("Enter two numbers (+ve INTEGERS ONLY) ");
		a = scan.nextInt();
		b = scan.nextInt();
	}
	@Override
	public void add() {
		
		System.out.println(a + b);
	}

	@Override
	public void sub() {
		
		System.out.println(a - b);
	}

	@Override
	public void mul() {
		
		System.out.println(a * b);
	}

	@Override
	public void div() {
		
		System.out.println(a / b);
	}

	@Override
	public void mod() {
		
		System.out.println(a % b);
	}

}
