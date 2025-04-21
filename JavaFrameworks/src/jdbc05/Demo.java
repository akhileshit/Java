package jdbc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo { // Updating the database through Java Program (Updating..)
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner scan = new Scanner(System.in);
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("DRIVER LOADED.");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june?user=root&password=Aa@9343@m");
		System.out.println("CONNECTION ESTABLISHED.");
		
		pstmt = con.prepareStatement("update batches set nos=? where id=?");
		System.out.println("PREPARED STATEMENT CREATED");
		System.out.println("Enter the #students & batch id");
		int nos = scan.nextInt();
		int id = scan.nextInt();
		pstmt.setInt(1, nos);
		pstmt.setInt(2, id);
		
		int nora = pstmt.executeUpdate();
		System.out.println("QUERY EXECUTED.");
			
		System.out.println(nora + " ROW(S) UPDATED.");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
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


//	Output:
/*
	DRIVER LOADED.
	CONNECTION ESTABLISHED.
	PREPARED STATEMENT CREATED
	Enter the #students & batch id
	350
	2
	QUERY EXECUTED.
	1 ROW(S) UPDATED.
	ALL RESOURCES CLOSED.
*/