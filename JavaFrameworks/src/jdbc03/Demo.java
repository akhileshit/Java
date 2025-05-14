package jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo { // Updating the database through Java Program (Inserting..)
	
	public static void main(String[] args) {
		// to help access inside finally block
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner scan = new Scanner(System.in);
		
		try {
		// Loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("DRIVER LOADED.");
		
		// Establishing the Connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june?user=root&password=Aa@9343@m"); // Done using 1 parameter
		System.out.println("CONNECTION ESTABLISHED.");
		
		// Creating the PreparedStatement Medium
		pstmt = con.prepareStatement("insert into batches values (?,?,?)"); // creating prepareStatement
		System.out.println("PREPARED STATEMENT CREATED.");
		System.out.println("Enter batchno, batchname & #students");
		int id = scan.nextInt();
		String batchname = scan.next();
		int nos = scan.nextInt();
		pstmt.setInt(1, id);
		pstmt.setString(2, batchname);
		pstmt.setInt(3, nos);
		
		// Querying
		int nora = pstmt.executeUpdate(); // returns #rows affected
		System.out.println("QUERY EXECUTED.");
		
		// Displaying the Result
		System.out.println(nora + " ROW(S) AFFECTED.");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// Closing the Resources in finally block
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
	Enter batchno, batchname & #students
	6
	junea6
	600
	PREPARED STATEMENT CREATED.
	QUERY EXECUTED.
	1 ROW(S) AFFECTED.
	ALL RESOURCES CLOSED.
*/