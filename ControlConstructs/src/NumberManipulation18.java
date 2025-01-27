import java.util.Scanner;

public class NumberManipulation18 { // Prime numbers in the Given range

	public static void main(String[] args) {
		System.out.println("Enter the starting and ending range");
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		primesInRange(start,end);

	}
	
	static void primesInRange(int start, int end) {
		int count=0;
		if (start>end && end>0 && start>0) {
			System.out.println("'Start' should be less than 'End' and positives");
		}
		
		else {
			System.out.println("Prime numbers b/w " + start + " and " + end + " are:");
			for (int i=start; i<=end; i++) {
				for (int j=1; j<=i; j++) {
					if (i%j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println(i);
				}
				count = 0;
			}
		}
	}

}
