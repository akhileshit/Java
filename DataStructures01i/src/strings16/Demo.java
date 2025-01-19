package strings16;

public class Demo {
	public static void main(String[] args) { // 'printf' - formatted output and String Format
		String str = "Hello";
		int n = 10000;
		float fl = 55.56f;
		System.out.printf("%s %d %f %n", str,n,fl);
		System.out.printf("%s %,d %.2f %n", str,n,fl); // 2 digits after point and ,
		System.out.printf("%10s %7d %.2f \n", str,n,fl); // 10chars including spaces and 7digits including spaces
		System.out.printf("%10s %07d %.2f \n", str,n,fl); // total 7digits prefixed with 0's
		System.out.printf("Hello my name is %s and iam %d years old \n", str,n,fl); // smooth
		
		System.out.println("********************************");
		
		String output = String.format("Hello my name is %s and iam %d years old \n", str,n,fl); // same as printf
		System.out.println(output);
	}
}
