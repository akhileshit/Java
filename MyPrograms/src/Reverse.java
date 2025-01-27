import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		System.out.println("Enter a number to reverse");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int i =num, p=0;
		while(i>0) {
			p = i%10;
			System.out.print(p);
			i = i/10;
		}
		scan.close();
	}
}
