package fileHandling03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo { // BufferedReader & BufferedWriter for FR & FW
	
	public static void main(String[] args) {
		try {
		String path1 = "C:\\Users\\Akhilesh S.DESKTOP-DGN3NBK\\eclipse-workspace1\\FileHandling\\input.txt";
		String path2 = "C:\\Users\\Akhilesh S.DESKTOP-DGN3NBK\\eclipse-workspace1\\FileHandling\\output.txt";
			
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2, true);
		
		BufferedReader br = new BufferedReader(fr);  // Bind fr with br
		BufferedWriter bw = new BufferedWriter(fw);
		
		String x;
		bw.newLine();
		while ((x = br.readLine()) != null) { // here readLine()[reads 1 full line, but it needs .newLine() to go to next line and read!] is more faster and efficient than read()[reads char by char as an integer, it doesn't need .newLine(), reads all lines of the file] 
			bw.write(x);
			bw.newLine(); // required/mandatory for reading all lines in a file
		}
		
		bw.flush();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// Even String, float data are read and sent by the last 3 programs even though they are collected in int variable x!!!!.
// maybe they are storing all characters as integer.....