import java.util.Scanner;

public class ScientificCalculator implements Calculator { // Implementing Calculator interface

	Scanner scan = new Scanner(System.in);
	int a , b;
	public void takeInput() {
		System.out.println("Name is ScientificCalci");
		System.out.println("Enter two numbers (+ve INTEGERS ONLY) ");
		a = scan.nextInt();
		b = scan.nextInt();
	}
	
	@Override
	public void add() {
		
		if (a==0 || b==0) {
			System.out.println("Seriously??");
			return;
		}
		System.out.println(a + b);
	}

	@Override
	public void sub() {
		
		if (a<b) {
			System.out.println("Please enter a > b");
			System.exit(0);
		}
		System.out.println(a - b);
	}

	@Override
	public void mul() {
		
		System.out.println(a * b);
	}

	@Override
	public void div() {
		
		if (b==0) {
			System.out.println("b cannot be zero");
			System.exit(0);
		}
		System.out.println(a / b);
	}

	@Override
	public void mod() {
		
		if (a<b) {
			System.out.println("Please enter a > b");
			System.exit(0);
		}
		System.out.println(a % b);
	}

}
