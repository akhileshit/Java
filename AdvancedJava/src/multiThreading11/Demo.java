package multiThreading11;

public class Demo { // Solving Race-Condition using "Daemon-Threads"
	
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		Thread t3 = new Thread(d1);
		
		t1.setName("type");
		t2.setName("autosave");
		t3.setName("autospellcheck");
		
		// Make Identified Background Activities as Daemon-Threads
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		// Decrease the priority of Daemon-Threads
		t2.setPriority(8);
		t3.setPriority(9);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

// 1st identify the background activities and keep it in infinite loop
// 2nd make the identified BA as Daemon Threads
// Then lower the Daemon thread priority

// This will ensure that saving and spell checking happens only after typing !  and also runs infinitely but only until the normal/foreground thread is alive
