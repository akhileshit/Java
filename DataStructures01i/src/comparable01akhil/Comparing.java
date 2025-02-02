package comparable01akhil; // age was not visible since it was made default(package private) inside Person Class which was created,imported and Deleted(Just to make it look like jar imported from somewhere else) . Hence iam using(implementing) comparator inside same package(imported jar file)
// Hence created this class inside the same imported package only
// If u want to see how exactly the "Person" class was written See "Personkjsadlfkj" class.
import java.util.Comparator;

public class Comparing implements Comparator { 

	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		if (p1.age > p2.age) {
			return 1;
		}
		else if(p1.age == p2.age) {
			return 0;
		}
		else {
			return -1;
		}
	}

	
	
}

