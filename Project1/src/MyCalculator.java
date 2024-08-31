
public class MyCalculator extends AbstractCalculator {

	@Override
	int addition(int arg0, int arg1) {
		return arg0 + arg1;
	}

	@Override
	int division(int arg0, int arg1) {
		return arg0 / arg1;
	}

	@Override
	int multplication(int arg0, int arg1) {
		return arg0 * arg1;
	}

	@Override
	int subtraction(int arg0, int arg1) {
		return arg0 - arg1;
	}

}
