
public class SimpleCalculator implements Calculator { // Implementing Calculator interface

	int a = 20 , b = 10;
	
	
	public void takeInput() {
		System.out.println("Name is SimpleCalci");
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
