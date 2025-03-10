package multiThreading03;

import java.util.Scanner;

public class Demo { // Without MultiThreading (Single Threaded program with 3 Independent subtask)
	
	public static void main(String[] args) {
		
		try {
		// SUBTASK 1
		Scanner sc = new Scanner(System.in);
		System.out.println("TYPING ACTIVITY STARTED");
		String sen = "";
		for (int i=1; i<=10; i++) {
			System.out.println("Type 1 word about KodNest");
			String word = sc.next();
			sen = word + sen + " ";
		}
		System.out.println(sen);
		System.out.println("TYPING ACTIVITY ENDED");
		
		
		
		// SUBTASK 2
		System.out.println("MULTIPLICATION ACTIVITY STARTED");
		int a=10;
		int b=20;
		Thread.sleep(2000);
		System.out.println("Multiplication result is: " + a*b);
		System.out.println("MULTIPLICATION ACTIVITY ENDED");
		
		
		
		// SUBTASK 3
		System.out.println("SEARCHING ACTIVITY STARTED");
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int key=15;
		for (int i=0; i<arr.length; i++) {
			if (key==arr[i]) {
				System.out.println("Key Found @ index " + i);
				Thread.sleep(2000);
				break;
			}
			Thread.sleep(2000);
		}
		System.out.println("SEARCHING ACTIVITY ENDED");
		}
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
