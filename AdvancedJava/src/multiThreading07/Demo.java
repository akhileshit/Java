package multiThreading07;

public class Demo { // Multi-Threading using Runnable Interface (many classes (many run()))
	
	public static void main(String[] args) {
		
		Demo1 type = new Demo1();
		Demo2 multiply = new Demo2();
		Demo3 search = new Demo3();
		
		Thread t1 = new Thread(type);
		Thread t2 = new Thread(multiply);
		Thread t3 = new Thread(search);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
