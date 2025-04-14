package fileHandling01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo { // FileInputStream & FileOutputStream
	
	public static void main(String[] args) {
		try {
		String path1 = "C:\\Users\\Akhilesh S.DESKTOP-DGN3NBK\\eclipse-workspace1\\FileHandling\\input.txt";
		String path2 = "C:\\Users\\Akhilesh S.DESKTOP-DGN3NBK\\eclipse-workspace1\\FileHandling\\output.txt";
		
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);
		
		int x;
		while ((x = fis.read()) != -1) {
			fos.write(x);
		}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
