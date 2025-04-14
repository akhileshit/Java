package fileHandling04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo { // Exception Handling in File Operations
	
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			String path1 = "C:\\Users\\Akhilesh S.DESKTOP-DGN3NBK\\eclipse-workspace1\\FileHandling\\input.txt";
			String path2 = "C:\\Users\\Akhilesh S.DESKTOP-DGN3NBK\\eclipse-workspace1\\FileHandling\\output.txt";
			fr = new FileReader(path1);
			fw = new FileWriter(path2);
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String x;
			while ((x = br.readLine()) != null) {
				bw.write(x);
			}
			
			bw.flush();
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
