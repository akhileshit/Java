package collections02;

public class Stack { // Stack Implementation
	private Object[] arr; // made Generic Stack
	private int top= -1;
	
	public Stack(int size) {
		arr = new Object[size]; //
		System.out.println("STACK OF SIZE " + arr.length + " CREATED");
	}
	
	public void push(Object e) { // made Generic 
		if (top==arr.length-1) {
			System.out.println("PUSH NOT POSSIBLE");
		}
		else  {
			top++;
			arr[top] = e;
		}
	}
	
	public void pop() {
		if (top == -1) {
			System.out.println("POP NOT POSSIBLE. STACK IS EMPTY.");
		}
		else {
			arr[top] = 0;
			top--;
		}
	}
	
	public void display() {
		for (int i=top; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	
}
