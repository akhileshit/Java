
public class Main { // Compile Time Polymorphism

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(10, 20)); // Calls add method which takes both int parameters
		System.out.println(calc.add(40.5f, 10.5f)); // Calls add method which takes both float parameters
		System.out.println(calc.add(10, 20.5)); // Calls add method which takes int and float parameters in sequence
		System.out.println(calc.add(10, 20.5f, 10.2)); // Calls add method which takes int, float and double parameters in sequence
	}

}
