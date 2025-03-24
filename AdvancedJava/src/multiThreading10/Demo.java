package multiThreading10;

public class Demo { // A normal MultiThreading Program looked at the perspective of "Race-Condition"
	
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		Thread t3 = new Thread(d1);
		
		t1.setName("type");
		t2.setName("autosave");
		t3.setName("autospellcheck");
		
		t1.start();
		t2.start();
		t3.start();
	}
}

// Until now we hv been told that only independent sub-tasks has to be threaded. But there is a Catch
// 		If there are dependent sub-tasks but also are background activities has to be multi-threaded

// Race-condition is good for MultiThreading to efficiently utilize the resources
// But Race-condition creates problem in this type of program
// Becaz our aim was to :
// 		1st Typing...
//		2nd AutoSpellChecking..
// 		Lastly AutoSaving...

// But this is not happening here every-time.....
// next program solves it..