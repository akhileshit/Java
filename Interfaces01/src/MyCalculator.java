
public class MyCalculator extends Demo implements AbstractCalculator {

	@Override
	public void addition(int a, int b) {
		int sum = a + b;
		System.out.println(sum);

	}

	@Override
	public void subtraction(int a, int b) {
		int sub = a - b;
		System.out.println(sub);

	}

	@Override
	public void multplication(int a, int b) {
		int prod = a * b;
		System.out.println(prod);

	}

	@Override
	public void division(int a, int b) {
		int div = a / b;
		System.out.println(div);

	}

}
