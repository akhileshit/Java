package multiThreading09;

import java.util.Scanner;

public class Demo1 implements Runnable {

	@Override
	public void run() { // Thread's Overridden method
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		if (name.equals("type")) {
			type();
		}
		else if (name.equals("multiply")) {
			mult();
		}
		else {
			search();
		}
	}

	public void type() { // typing method
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

	public void mult() { // multiplication method
		System.out.println("MULTIPLICATION ACTIVITY STARTED");
		int a=10;
		int b=20;
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Multiplication result is: " + a*b);
		System.out.println("MULTIPLICATION ACTIVITY ENDED");
	}

	public void search() { // searching method
		try {
			System.out.println("SEARCHING ACTIVITY STARTED");
			int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
			int key=15;
			for (int i=0; i<arr.length; i++) {
				if (key==arr[i]) {
					System.out.println("Key Found @ index " + i);
					Thread.sleep(1000); 
					break;
				}
					Thread.sleep(2000);
			}
			System.out.println("SEARCHING ACTIVITY ENDED");
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}

