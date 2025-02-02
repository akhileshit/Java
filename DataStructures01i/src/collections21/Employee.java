package collections21;

public class Employee { // Just one Employee Class
	
	String name;
	int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "  " + age;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this.name == ((Employee)obj).name) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
//	if (obj==null  ||  obj.getClass() != this.getClass()) {
//	return false;
//}
}
