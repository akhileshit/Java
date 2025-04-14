package serialAndDeserial01;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo { // Serialization

	public static void main(String[] args) {
		try {
			
		Student s = new Student("Sarala", 25, "Female", 100);
		FileOutputStream fos = new FileOutputStream("persist.txt");
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
