package swingJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	//Convertion to String to help display in JTextArea
	String headerString;
	String rowString;
	
	public Insert(int id, String name, int cls, double marks, String gender) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest?user=root&password=Aa@9343@m");
		
		pstmt = con.prepareStatement("Insert into studentdetails values (?,?,?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, cls);
		pstmt.setDouble(4, marks);
		pstmt.setString(5, gender);
		
		int nora = pstmt.executeUpdate();
		
		if(nora > 0)  {
			System.out.println("Record Inserted Successfully.");
			headerString = "ID | NAME | CLASS | MARKS | GENDER";
			System.out.println(headerString);
			rowString = id + " | " + name + " | " + cls + " | " + marks + " | " + gender;
			System.out.println(rowString);
		}
		else System.out.println("No Records Inserted.");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				pstmt.close();
				con.close();
				System.out.println("all closed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		new Insert(25, "Abhishek", 12, 100, "Male");
	}
}
