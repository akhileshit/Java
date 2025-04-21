package swingJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

public class Update {
	String headerString = "";
	String rowString = "";
	
	public Update(int id, HashMap<Object, Object> columnMap) {
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		
		try {
		// Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish the Connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest?user=root&password=Aa@9343@m");
		//************************************************************************************
		// Create 1st Medium
		pstmt1 = con.prepareStatement("Select * from studentdetails where id = ?");
		pstmt1.setInt(1, id);
		
		// Execute 1st Query
		rs1 = pstmt1.executeQuery();
		
		// Display 1st Result
		if (!rs1.next()) {  
			System.out.println("Id " + id + " Does Not Exist.");
			return;
		}
		//************************************************************************************
		// Create 2nd Medium
		HashMap<Object, Object> hm = columnMap;
		pstmt2 = con.prepareStatement("Update studentdetails set name = ?, class = ?, marks = ? where id = ?");
		if (hm.containsKey("name"))  {
			pstmt2.setObject(1, hm.get("name"));
		}else   { //else previous value
			pstmt2.setString(1, rs1.getString(2));
		}
		
		if (hm.containsKey("class")) {
			pstmt2.setObject(2, hm.get("class"));
		}else {
			pstmt2.setInt(2, rs1.getInt(3));
		}
		
		if (hm.containsKey("marks"))  {
			pstmt2.setObject(3, hm.get("marks"));
		}else  {
			pstmt2.setDouble(3, rs1.getDouble(4));
		}
		
		pstmt2.setInt(4, id);
		
		// Execute 2nd Query
		int nora = pstmt2.executeUpdate();
		
		// Display 2nd Result
		if(nora > 0) {
			System.out.println("Row Update Successful.");
		}
		else {
			System.out.println("Row Not Updated.");
		}
		//************************************************************************************
		// Create 3rd Medium
		pstmt3 = con.prepareStatement("Select * from studentdetails where id = ?");
		pstmt3.setInt(1, id);
		
		// Execute 3rd Query
		rs2 = pstmt3.executeQuery();
		
		// Display 3rd Result
		headerString = "ID | NAME | CLASS | MARKS | GENDER";
		System.out.println(headerString);
		while (rs2.next()) {  
			rowString = rs2.getInt(1) + " | " + rs2.getString(2) + " | " + rs2.getInt(3) + " | " + rs2.getDouble(4) + " | " + rs2.getString(5);
			System.out.println(rowString);
		}
				
	
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// Close the Resources
		finally {
			try {
				rs1.close();
				if (rs2 != null)  rs2.close();
				pstmt1.close();
				if (pstmt2 != null)  pstmt2.close();
				if (pstmt3 != null)  pstmt3.close();
				con.close();
				System.out.println("all closed.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// for testing purpose.
	public static void main(String[] args) {
		
		int id = 25;
		HashMap<Object, Object> hm = new HashMap<>();
		hm.put("name", "Ankit");
		
		new Update(id, hm);
	}
}
