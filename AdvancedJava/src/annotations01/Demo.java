package annotations01;

import java.util.ArrayList;
import java.util.List;

public class Demo { // In-bulit Annotations 01
	
	@SuppressWarnings({"unused", "deprecation", "rawtypes", "removal"})   
	public static void main(String[] args) {
		int a; // warning: local variable not used
		int b= 10;
		int c= 20;
		int res = b + c;
		System.out.println(res);
		
		
		Student s = new Student();
		s.work();  // Strike-d since we declared it as deprecated
		
		List al = new ArrayList(); // warning: raw type (and) local variable not used
		
		
		Integer i = new Integer(20); // warning: Integer(int) deprecated and marked for removal (and) local variable not used
	}
	
}

// All possible warning are removed successfully using @SuppressWarnings() Annotation.