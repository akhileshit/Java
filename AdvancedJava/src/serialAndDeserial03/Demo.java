package serialAndDeserial03;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo { // Selective Serialization

	public static void main(String[] args) {
		try {
			
		Student s = new Student("Vinoda", 24, "Female", 100, "a12345");
		FileOutputStream fos = new FileOutputStream("persist1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);  // for optimization (acts like crusher!)
		oos.writeObject(s); // writes crushed object data into file in hard disk
		
		System.out.println("Serialization Completed.");
		System.out.println("Go Check the File...");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
