package multiThreading04;

public class Demo {
	
	public static void main(String[] args) { // With MultiThreading (Multi-Threaded program with 3 Independent subtask)
		
		// Classes of Thread type (is-a)
		Demo1 typing = new Demo1();
		Demo2 mult = new Demo2();
		Demo3 search = new Demo3();
		
		typing.start(); // runs this thread
		mult.start();
		search.start();
	}
}

// Makes very good use of CPU-time(God's time!!) given to it
// Remember this is 1-Program, 1-JRE, 1-ThreadScheduler, 4-Threads(main, typing, mult & search)