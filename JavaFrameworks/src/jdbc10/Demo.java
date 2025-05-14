package jdbc10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo { // Assignment:    "Batch Updates" in jdbc - for faster multiple updates.(Homogenous Batch)

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner scan = new Scanner(System.in);
		
		try {
		//LOAD THE DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("DRIVER LOADED.");
		
		//ESTABLISH THE CONNECTION
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june?user=root&password=Aa@9343@m");
		System.out.println("CONNECTION ESTABLISHED.");
		
		//CREATE THE MEDIUM (PREPARED STATEMENT)
		pstmt = con.prepareStatement("insert into batches values (?,?,?)"); //Only one statement
		for (int i=1; i<=3; i++) { //Adding 3 different batches data.
			System.out.println("Enter the ID, BATCH & #STUDENTS to insert (provide in the same order).");
			pstmt.setInt(1, scan.nextInt());
			pstmt.setString(2, scan.next());
			pstmt.setInt(3, scan.nextInt());
			System.out.println("PREPARED STATEMENT " + i + " CREATED.");
			pstmt.addBatch();
			System.out.println("RECORD " + i + " ADDED TO THE BATCH.");
		}
		
		//EXECUTE THE QUERY
		int[] nora = pstmt.executeBatch();
		System.out.println("SENT A BATCH WITH MULTIPLE RECORDS 'AT ONCE' TO THE DATABASE!");
		
		//DISPLAY THE RESULT
		int count = 0;
		for (int i : nora) {
			if (i == 1) {
				count++;
			}
			else {
				System.err.println("SOME ERROR OCCURRED WHILE EXECUTING SOME QUERIES.");
			}
		}
		if (count == 3) {
			System.out.println("ALL THE " + count + " RECORDS INSERTED INTO THE DATABASE SUCCESSFULLY.");
		}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//CLOSE THE RESOURCES
		finally {
			try {
				scan.close();
				pstmt.close();
				con.close();
				System.out.println("ALL RESOURCES CLOSED.");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

//Output:
/*
	DRIVER LOADED.
	CONNECTION ESTABLISHED.
	Enter the ID, BATCH & #STUDENTS to insert (provide in the same order).
	7
	junea7
	650
	PREPARED STATEMENT 1 CREATED.
	RECORD 1 ADDED TO THE BATCH.
	Enter the ID, BATCH & #STUDENTS to insert (provide in the same order).
	8
	junea8
	200
	PREPARED STATEMENT 2 CREATED.
	RECORD 2 ADDED TO THE BATCH.
	Enter the ID, BATCH & #STUDENTS to insert (provide in the same order).
	9
	junea9
	120
	PREPARED STATEMENT 3 CREATED.
	RECORD 3 ADDED TO THE BATCH.
	SENT A BATCH WITH MULTIPLE RECORDS 'AT ONCE' TO THE DATABASE!
	ALL THE 3 RECORDS INSERTED INTO THE DATABASE SUCCESSFULLY.
	ALL RESOURCES CLOSED.
*/