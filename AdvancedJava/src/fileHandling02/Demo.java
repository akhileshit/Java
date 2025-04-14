package fileHandling02;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo { // FileReader & FileWriter

	public static void main(String[] args) {
		try {
		String path1 = "C:\\Users\\Akhilesh S.DESKTOP-DGN3NBK\\eclipse-workspace1\\FileHandling\\input.txt";
		String path2 = "C:\\Users\\Akhilesh S.DESKTOP-DGN3NBK\\eclipse-workspace1\\FileHandling\\output.txt";
		
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		
		int x;
		while ((x = fr.read()) != -1) {
			fw.write(x);
		}
		
		fw.flush(); // Data is there, but u have to force it to see it!!
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// FileStreams only capable of sending small data @ a time. but FR and FW are like big pipes, hence when u send v.small amount of data through it. U hv to necessarily flush it to see it on the other side!!