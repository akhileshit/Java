package collections21;

public class Demo1 { // toString() and equals() method Overriding concept
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Sharan", 25);
		System.out.println(p1);
		
		Person p2 = new Person("Sharan", 25);
		System.out.println(p2);
		
		Employee e = new Employee("Sharan", 25);
		System.out.println(e);
		
		System.out.println(p1.equals(p2)); // Not working right?. Go and Override "Object" class's "equals()" method in "Person". STATUS: Handled 
		
		System.out.println(p1.equals(null)); // Gives "NullPointerException" . Handle this also in equals() while Overriding. STATUS: Handled
		
		System.out.println(p1.equals(e)); // Gives "ClassCastException" (becaz of Casting to Person). Handle this also in equals() while Overriding. STATUS: Handled
	}
}
