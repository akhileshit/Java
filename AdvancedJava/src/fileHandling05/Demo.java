package fileHandling05;

import java.io.File;

public class Demo { // "File" class in Java
	
	public static void main(String[] args) {
		try {
		String path1 = "C:\\Users\\Akhilesh S.DESKTOP-DGN3NBK\\eclipse-workspace1\\FileHandling\\input.txt";
		String path2 = "C:\\";
		
		File f1 = new File(path1);
		File f2 = new File(path2);
		
		System.out.println(f1.exists());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getCanonicalPath());
		System.out.println(f1.getName());
		System.out.println(f1.getParent());
		System.out.println(f1.isDirectory()); // false
		System.out.println(f2.isDirectory()); // true
		System.out.println(f1.isFile()); // true
		System.out.println(f1.canRead()); 
		System.out.println(f1.canWrite()); 
		System.out.println(f1.canExecute()); 
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
