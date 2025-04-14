package AdvSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		try {
		FileOutputStream fos = new FileOutputStream("persist01.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		User u = new User("akhil", "a12345");
		oos.writeObject(u);
		
		System.out.println("Serialization Completed.");
		System.out.println("Go check the file persist01.txt....");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// stored data: ¬í sr AdvSerialization.User        L usernamet Ljava/lang/String;xpt akhilt 54321ax