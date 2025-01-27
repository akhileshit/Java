package collections02;

public class Demo {
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		stack.push(9);
		stack.push("Hello");
		stack.push('C');
		stack.push(true);
		stack.push(1.054);
		
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
		
		stack.display();
		
	}
}
