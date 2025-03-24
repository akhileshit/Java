package multiThreading07;

public class Demo3 implements Runnable{
	
	@Override
	public void run() {
		try {
		System.out.println("SEARCHING ACTIVITY STARTED");
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int key=15;
		for (int i=0; i<arr.length; i++) {
			if (key==arr[i]) {
				System.out.println("Key Found @ index " + i);
				Thread.sleep(2000); // Throws checked Exception
				break;
			}
				Thread.sleep(2000);
		}
		System.out.println("SEARCHING ACTIVITY ENDED");
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
