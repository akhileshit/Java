package dsSimulator;

public class Queues {
	private int front = 0;
	private int rear = front;
	private Object[] arr;
	
	public Queues(int size) { // Constructor + Create Queue
		arr = new Object[size];
		System.out.println("Queue of size " + size + " created.");
	}
	
	public void enQueue(Object o) { // EnQueue
		if (rear < arr.length) {
			arr[rear] = o;
			rear++;
		}
		else {
			System.out.println("CANNOT ADD. QUEUE IS FULL.");
		}
	}
	
	public void deQueue() { // DeQueue
		if (front == rear) {
			System.out.println("CANNOT DEQUEUE. QUEUE IS EMPTY.");
		}
		else {
			arr[front] = null;
			for (int i=0; i<rear-1; i++) { //move the queue
				arr[i] = arr[i+1];
			}
			rear--;
		}
	}
	
	public void display() { // Display Queue
		if (front == rear) {
			System.out.println("QUEUE IS EMPTY.");
		}
		else {
			for (int i=0; i<=rear-1; i++) {
				System.out.print(arr[i]);
				if (i != rear-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() { // toString() Overridden
		String s = "";
		s = "[";
		for (int i=0; i<=rear-1; i++) {
			s = s + arr[i].toString();
			if (i != rear-1) {
				s = s + ", ";
			}
		}
		s = s + "]";
		return s;
	}
}



