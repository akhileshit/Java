package collections01;

public class Demo {
	public static void main(String[] args) {
		Array arr = new Array(5);
		
		arr.insert(0, 50);
		arr.insert(1, 20);
		arr.insert(2, 15);
		arr.insert(3, 1);
		arr.insert(4, 85);
		arr.insert(5, 200000);
		
		arr.delete(3);
		
		arr.display();
		
		arr.sort(); //must
		arr.display();
		arr.search(20);
	}
	
}
