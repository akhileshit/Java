package multiThreading01;

public class Demo { // MultiThreading in Java (INtro)
	
	public static void main(String[] args) { 
		
		System.out.println("Hello Thread");
		Thread t = Thread.currentThread(); // method(static) To see on which thread the method is running on
		System.out.println(t);
		
		t.setName("KODNEST"); // to change/set the current thread name
		t.setPriority(4); // to change/set the current thread priority
		System.out.println(t);
		
		t.setPriority(Thread.MIN_PRIORITY); // a static,final variable to set 1 as priority
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY); // a static,final variable to set 10 as priority
		System.out.println(t);
		t.setPriority(Thread.NORM_PRIORITY); // a static,final variable to set 5 as priority
		System.out.println(t);
		
	}
}


//currentThread() ---->  Thread[thread#, thread_name, thread_priority, method_which_the_thread_is_running]
//Thread[#1,main,5,main]