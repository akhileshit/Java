package multiThreading12;

public class BathroomApp { // Synchronized Resource  (method)
	
	public static void main(String[] args) {
		
		Bathroom b = new Bathroom();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Other");
		
		t1.start();
		t2.start();
		t3.start();
	}
}

//we can achieve similar result using join() 
//t1.start()
//t1.join() // paused here in this line until t1 finishes
//...

//But it is sequential approach (MultiThreading left the chat!!)
//Hence we use synchronized keyword to lock the shared resource