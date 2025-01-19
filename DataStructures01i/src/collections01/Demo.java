package collections01;

public class Demo {
	public static void main(String[] args) {
		Array arr = new Array(5);
		
		arr.insert(1, 20);
		arr.insert(0, 200);
		arr.insert(2, 2000);
		arr.insert(3, 20000);
		arr.insert(4, 200000);
		arr.insert(5, 200000);
		
		arr.delete(3);
		
		arr.display();
	}
	
}
