package multiThreading14;

public class Warrior implements Runnable {

	String astra1 = "Brahmasathra";
	String astra2 = "Sarpasthra";
	String astra3 = "Paashupathastra";
	
	
	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Karna")) {
			karnaAcquire();
		}
		else {
			arjunaAcquire();
		}
		
	}
	
	public void karnaAcquire() {
		try {
			Thread.sleep(5000);
			synchronized (astra1) {  // variable "astra1" synchronized
				System.out.println(Thread.currentThread().getName() + " Acquired Astra1 " + astra1);
				Thread.sleep(5000);
				synchronized (astra2) {  // variable "astra2" synchronized
					System.out.println(Thread.currentThread().getName() + " Acquired Astra2 " + astra2);
					Thread.sleep(5000);
					synchronized (astra3) {  // variable "astra3" synchronized
						System.out.println(Thread.currentThread().getName() + " Acquired Astra3 " + astra3);
						Thread.sleep(5000);
					} // Releases Lock on astra3
				} // Releases Lock on astra2
			} // Releases Lock on astra1
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public void arjunaAcquire() {
		try {
			Thread.sleep(5000);
			synchronized (astra3) {  // variable "astra3" synchronized
				System.out.println(Thread.currentThread().getName() + " Acquired Astra3 " + astra3);
				Thread.sleep(5000);
				synchronized (astra2) {  // variable "astra2" synchronized
					System.out.println(Thread.currentThread().getName() + " Acquired Astra2 " + astra2);
					Thread.sleep(5000);
					synchronized (astra1) {  // variable "astra1" synchronized
						System.out.println(Thread.currentThread().getName() + " Acquired Astra1 " + astra1);
						Thread.sleep(5000);
					} // Releases Lock on astra1
				} // Releases Lock on astra2
			} // Releases Lock on astra3
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
	}

}
// I think this may be the example for "circular wait", mutual exclusion, hold&wait & no preemption