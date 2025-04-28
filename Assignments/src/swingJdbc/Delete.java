package swingJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Delete {
	String headerString = "";
	String rowString = "";
	boolean noId = false;
	
	public Delete(int id) {
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;

		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest?user=root&password=Aa@9343@m");
		
		pstmt1 = con.prepareStatement("Select * from studentdetails where id = ?");
		pstmt2 = con.prepareStatement("Delete from studentdetails where id = ?");
		pstmt1.setInt(1, id);
		pstmt2.setInt(1, id);
		
		rs = pstmt1.executeQuery();
		int result = pstmt2.executeUpdate();
	
		if (result > 0)  System.out.println("Row Deleted.");
		else  {
			noId = true;
			System.out.println("No Rows Deleted.");
		}
		headerString = "ID | NAME | CLASS | MARKS | GENDER";
		System.out.println(headerString);
		while (rs.next()) {
			rowString = rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3) + " | " + rs.getDouble(4) + " | " + rs.getString(5);
			System.out.println(rowString);
		}
		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				rs.close();
				pstmt1.close();
				pstmt2.close();
				con.close();
				System.out.println("all closed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		new Delete(25);
	}
}
