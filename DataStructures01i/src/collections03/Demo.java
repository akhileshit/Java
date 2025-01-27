package collections03;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		
		queue.push(7);
		queue.push(8);
		queue.push(2520);
		queue.push(7);
		queue.push(5);
		queue.push(121);
		
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		
		queue.push(150);
		
		queue.pop();
		queue.pop();
		queue.pop();
		
		
		queue.display();
	
	}
}
