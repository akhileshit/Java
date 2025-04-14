import java.io.FileOutputStream;

public class Serialization01 {
	
	public static void main(String[] args) {
		try {
//		String path = 
		
		User user = new User("Hello", 25);
		
		FileOutputStream fos = new FileOutputStream("persist.txt");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class User {
	String name;
	int age;
	
	public User(String name, int age) {
		this.age = age;
		this.name = name;
	}
}