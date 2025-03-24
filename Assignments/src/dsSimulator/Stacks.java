package dsSimulator;

public class Stacks {
	
	private static int top = -1;
	private static Object[] arr;
	
	
	public Stacks(int l) { // Constructor
		if (l <= 0) {
			System.out.println("STACK SIZE SHOULD BE GREATER THAN 0");
			return;
		}
		else {
			arr = new Object[l];
		}
	}
			
	public int push(Object o) { // Push
		if (top == arr.length-1) {
			System.out.println("STACK IS FULL");
			return -1;
		}
		else {
			arr[++top] = o;
		}
		return 1;
	}
	
	public int pop() { // Pop
		if (top == -1) {
			System.out.println("CANNOT POP. STACK IS EMPTY");
			return -1;
		}
		else {
			arr[top] = null;
			top--;
		}
		return 1;
	}
	
	public void display() { // Display
		if (top == -1) System.out.println("STACK IS EMPTY");
		else {
			for (int i=top; i>=0; i--) {
				System.out.println(arr[i]);
			}
		}
	}
	
	@Override
	public String toString() { // toString() Overridden
		String s = "";
		for (int i=top; i>=0; i--) {
			if (i == top) {
				s = "[" + arr[i];
			}
			else {
				s = s + ", " + arr[i];
			}
			if (i == 0) {
				s = s + "]";
			}
		}
		return s;
	}

}
