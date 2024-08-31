import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number to be searched bw 1 to 8");
		int n=scan.nextInt();
		
		//For
//		for(int i=1; i<=8; i++) {
//			if(i==n) {
//				System.out.println("Skipped search of item: "+n);
//				continue;
//			}
//			System.out.println("Checking item: "+i);
//						
//		}
		
		//While
//		int i=1;
//		while(i<=8) {
//			if(i==n) {
//				System.out.println("Found item "+n+" Stopped Search");
//				break;
//			}
//			System.out.println("Checking item: "+i);
//			i++;
//		}
		
		//Do-while
		int i=1;
		do {
			if(i==n) {
				System.out.println("Skipped search of item: "+n);     //some error is there in program
				continue;
			}
			System.out.println("Checking item: "+i);
			i++;
		}
		while(i<=8);
		scan.close();
	}

}
