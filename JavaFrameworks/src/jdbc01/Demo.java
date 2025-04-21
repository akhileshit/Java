package jdbc01;

import java.sql.Connection; // All the imports should be done from java.sql only
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
	
	public static void main(String[] args) { // Reading the data from the Database through Java Program using JDBC(ofcourse!)
		try {
		//Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("DRIVER LOADED.");
		
		//Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june", "root", "Aa@9343@m");
		System.out.println("CONNECTION ESTABLISHED.");
		
		//Creating the Statement Medium
		Statement stmt = con.createStatement();
		System.out.println("STATEMENT MEDIUM CREATED.");
		
		//Query
		String sql = "select * from batches";
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("QUERY EXECUTED AND GOT THE RESULTSET FROM DB INTO JAVA.");
		
		//Display the Result
		System.out.println("RESULT SET:");
		while(rs.next() == true) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3)); // can give column names also! instead of numbers
		}
		
		//Close the Resources
		rs.close();
		stmt.close();
		con.close();
		System.out.println("ALL RESOURCES CLOSED.");
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
