package serialAndDeserial04;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import serialAndDeserial03.Student; // imported Student class

public class Demo { // Selective DeSerialization
	
	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("persist1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s = (Student) ois.readObject();
		System.out.println("Deserialization Completed.");
		System.out.println(s); // password stored as null !!!!
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
