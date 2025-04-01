package dsSimulator;

public class Arrays {
	
	private Object[] arr;
	
	public Arrays(int size) { // Constructor
		if (size < 0) {
			System.out.println("Size of the Array should be greater than 0");
		}
		else {
			arr = new Object[size];
		}
	}
	
	
	public int insert(int pos, Object ele) { // Insert
		if (pos < 0 || pos > arr.length-1) {
			System.out.println("Invalid Position.");
			return -1;
		}
		else {
			arr[pos] = ele;
			System.out.println("Element Inserted.");
			return 1;
		}
	}
	
	public int delete(int pos) { // Delete
		if (pos < 0 || pos > arr.length-1) {
			System.out.println("Invalid Position.");
			return -1;
		}
		else {
			arr[pos] = null;
			System.out.println("Element Deleted");
			return 1;
		}
	}
	
	public void display() { // Display
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	@Override
	public String toString() { // toString() Overridden
		String s = "";
		for (int i=0; i<arr.length; i++) {
			if (i == 0) {
				s = "[" + arr[i];
			}
			else {
				s = s + ", " + arr[i];
			}
			if (i == arr.length-1) {
				s = s + "]";
			}
		}
		return s;
	}
	
}
