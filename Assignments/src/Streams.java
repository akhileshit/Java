import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Streams {  // Research on FileInputStream & FileOutputStream
	
	public static void main(String[] args) {
		
		try {
		FileInputStream fi = new FileInputStream("input.txt"); // Throws highly(my term) Checked exception, hence try-catch
		FileOutputStream fo = new FileOutputStream("output.txt");
		
		int num ;
		while ((num = fi.read()) != -1) {
			fo.write(num);
		}
		
		fi.close();
		fo.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

// This program copy is in desktop/Assg_kod/During..../Streams.java  Go check and run there, NOT HERE