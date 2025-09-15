import java.util.Scanner;

public class Fib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		
		if (n==1) {
			System.out.println("0");
			return;
		}
		if (n==2) {
			System.out.println("0");
			System.out.println("1");
			return;
		}
		System.out.println("0");
		System.out.println("1");
		for (int i=2; i<n; i++) {
			int fib = n1 + n2;
			n1 = n2;
			n2 = fib;
			System.out.println(fib);
		}
	}
}
