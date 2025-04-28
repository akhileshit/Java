package swingJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectAll {
	String headerString;
	String rowsString;
	
	public SelectAll() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver"); // This needs mysql-connector jar
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest?user=root&password=Aa@9343@m");
		
		stmt = con.createStatement();
		
		String sql = "Select * from studentdetails";
		rs = stmt.executeQuery(sql);
		
		headerString = "ID | NAME | CLASS | MARKS | GENDER";
		System.out.println(headerString);
		rowsString = "";
		while (rs.next()) {  
			rowsString += rs.getInt(1) + "  | " + rs.getString(2) + " | " + rs.getInt(3) + " | " + rs.getDouble(4) + " | " + rs.getString(5) + "\n";
		}
		System.out.println(rowsString);
		System.out.println("done");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
				System.out.println("all closed");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// for testing purpose.
//	public static void main(String[] args) {
//		
//		new SelectAll();
//	}
}
