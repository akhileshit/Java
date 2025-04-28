package swingJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomSelect {
	String colHeading = "";
	String colString = "";
	
	public CustomSelect(int id, String columnString) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		// Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish the Connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest?user=root&password=Aa@9343@m");
		
		// Create the Medium (Prepared Statement)
		pstmt = con.prepareStatement("Select * from studentdetails where id = ?");
		pstmt.setInt(1, id);
		
		// Execute the Query
		rs = pstmt.executeQuery();
		
		// Display the Result
		String []str = columnString.split(", ");
		for (String s : str) {
			colHeading = colHeading + s + " | ";
		}
		System.out.println(colHeading); // final column names
		while (rs.next()) {
			for (String s : str) {
				colString = colString + rs.getObject(s) + " | ";   //getObject() will fetch specified column of any type 
			}
			System.out.println(colString);  // final column values
		}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// Close the Resources
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
				System.out.println("all closed.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// for testing purpose
//	public static void main(String[] args) {
//		
//		String col1 = "ID";
//		String col2 = "GENDER";
//		int id = 1;
//		String str = col1 + ", " + col2;
//		new CustomSelect(id, str);
//	}
}
