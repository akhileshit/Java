package collections02;

public class Stack {
	private int[] arr;
	private int top= -1;
	
	public Stack(int size) {
		arr = new int[size];
		System.out.println("STACK OF SIZE " + arr.length + " CREATED");
	}
	
	public void push(int e) {
		if (top>=0 && top<=arr.length-1) {
			top++;
			arr[top] = e;
		}
		else {
			System.out.println("PUSH NOT POSSIBLE");
		}
	}
	
	public void pop() {
		if(top>=0 && top<=arr.length-1) {
			arr[top] = 0;
			top--;
		}
		else {
			System.out.println("POP NOT POSSIBLE");
		}
	}
	
	public void display() {
		for (int i=top; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	
}
