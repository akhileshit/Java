package serialAndDeserial02;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import serialAndDeserial01.Student; // Imported Student to match the object data stored

public class Demo { // DeSerialization
 
	public static void main(String[] args) {
		try {
			
		FileInputStream fis = new FileInputStream("persist.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);  // for optimization 
		Student s = (Student)ois.readObject(); // reads crushed object data stored in file 
		
		System.out.println("Deserialization Completed.");
		System.out.println(s); // objects data successfully retained from the file!!
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
