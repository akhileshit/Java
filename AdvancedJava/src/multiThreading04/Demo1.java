package multiThreading04;

import java.util.Scanner;

public class Demo1 extends Thread { // 1st Independent Thread
	@Override
	public void run() { // Overriding Thread's run() method
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
		sc.close();
	}
}
