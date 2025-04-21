package jdbc06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo { // To perform any CRUD Queries on database through java        (execute())
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		
		try {
		// Loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("DRIVER LOADED.");
		// Establishing the Connection	
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june?user=root&password=Aa@9343@m");
		System.out.println("CONNECTION ESTABLISHED.");
		// Create the Medium (Prepared Statement)
		pstmt = con.prepareStatement("select id,nos from batches where batch=?"); // Can put any CRUD queries!!. Since we hv used .execute() in coming line.
		System.out.println("PREPARED STATEMENT CREATED.");
		System.out.println("Enter batch-name to fetch: ");
		String bname = scan.next();
		pstmt.setString(1, bname);
//		pstmt = con.prepareStatement("update batches set nos=? where id=?"); // Can put any CRUD queries!!. Since we hv used .execute() in coming line.
//		System.out.println("PREPARED STATEMENT CREATED.");
//		System.out.println("Enter the #students & batch id");
//		int nos = scan.nextInt();
//		int id = scan.nextInt();
//		pstmt.setInt(1, nos);
//		pstmt.setInt(2, id);
		// Query
		boolean result = pstmt.execute(); // If ResultSet it Returns true, If UpdateCount it Returns false (2 in 1)
		System.out.println("QUERY EXECUTED.");
		// Display the Result
		if(result == true) {
			rs = pstmt.getResultSet();
			System.out.println("RESULT: ");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getInt("nos"));
			}
		}
		else {
			int nora = pstmt.getUpdateCount();
			System.out.println(nora + " ROW(S) AFFECTED.");
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		// Close the Resources
		finally {
			try {
				
			if (rs != null) { // ensures closing only if this resource is created.
				rs.close();
			}
			pstmt.close();
			con.close();
			scan.close();
			System.out.println("ALL RESOURCES CLOSED.");
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
