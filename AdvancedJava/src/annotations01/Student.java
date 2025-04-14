package annotations01;

import java.io.Serializable;

@SuppressWarnings("serial")  
public class Student implements Serializable { // In-built Annotations 02
	
	@Deprecated   // we declared it as deprecated
	public void work() {
		System.out.println("Student is Working...");
	}

}

// serialVersionUID declare warning suppressed using Annotation. (To tell the "compiler" to supress warning)
// Added Annotation to tag a method as Deprecated. (To tell the "developers" using this method to find alternative ASAP)