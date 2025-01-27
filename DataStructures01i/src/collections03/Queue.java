package collections03;

public class Queue {
	private int[] arr;
	private int front, rare ;
	
	
	public Queue(int size) {
		arr = new int[size];
		System.out.println("QUEUE OF SIZE " + arr.length + " CREATED");
	}
	
	public void push(int e) {
		if (rare>arr.length-1) {
			System.out.println("PUSH NOT POSSIBLE");
		}
		else {
			arr[rare] = e;
			rare++;
		}
	}
	
	public void pop() {
		if (rare==0) {
			System.out.println("POP NOT POSSIBLE. QUEUE IS EMPTY.");
		}
		else {
			rare--;
			arr[front] = 0;
			for (int i=0; i<=rare-1; i++) {
				arr[i] = arr[i+1];
			}
		}
	}
	
	public void display() {
		for (int i=0; i<=rare-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
