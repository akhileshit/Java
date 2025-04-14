package AdvSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main02 {
	
	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("persist01.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		User u = (User) ois.readObject();
		System.out.println("DeSerialization Completed.");
		System.out.println("Restored Object Data: " + u); // The password which is shown here is not just read and written(it went through encryption & decryption)
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
