package swingJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
	
	String headerString;
	String rowString;
	
	public Select(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest?user=root&password=Aa@9343@m");
		
		pstmt = con.prepareStatement("Select * from studentdetails where id = ?");
		pstmt.setInt(1, id);
		
		pstmt.execute();
		rs = pstmt.getResultSet();
		
		headerString = "ID | NAME | CLASS | MARKS | GENDER";
		System.out.println(headerString);
		while (rs.next()) {  /////
			rowString = rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3) + " | " + rs.getDouble(4) + " | " + rs.getString(5);
			System.out.println(rowString);
		}
		
		System.out.println("done");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
				System.out.println("all closed");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// for Testing purpose.
	public static void main(String[] args) {
		
		new Select(25);
	}
}
