package jdbc09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo { // Assignment:    "Batch Updates" in jdbc - for faster multiple updates.(Heterogenous Batch)
	
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		
		try {
		// Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish the Connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june?user=root&password=Aa@9343@m");
		
		// Create the Medium 
		stmt = con.createStatement();
		
		con.setAutoCommit(false); // for making all statements as one transaction
		
		// add multiple statements(queries) to a batch
		stmt.addBatch("insert into batches values (7,'abcd',14)");
		stmt.addBatch("insert into batches (id,batch) values (8,'abcd')");
		stmt.addBatch("update batches set batch='hijk' where id=8");
		stmt.addBatch("insert into batches (id,nos) values (9,125)");
		stmt.addBatch("insert into studentdb.student values (7,25)");
		
		// Execute Query
		// execute the batch (returns array of rows-affected)
		int[] result = stmt.executeBatch();
		
		// Display the Result
		int c = 0;
		for (int i : result) {
			if (i > 0)  c++;
			else System.out.println("Some error occurred while executing some of the queries.");
		}
		if (c == result.length)  System.out.println("All Statements Executed Successfully");
			
		con.commit(); // commit at last
		
		} 
		catch (Exception e) {
			try {
				con.rollback(); // Rollback if any error occurs in b/w
				con.setAutoCommit(true);
			} 
			catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			
		}
		// Close the Resources
		finally {
			try {
				stmt.close();
				con.setAutoCommit(true);
				con.close();
				System.out.println("All Resources Closed.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
