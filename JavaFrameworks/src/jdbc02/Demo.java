package jdbc02;

import java.sql.Connection; // All the imports should be done from java.sql only
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo { // Reading the data from the Database through Java Program by taking User Input (Selecting..)
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
		//Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("DRIVER LOADED.");
		
		//Establish the Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june", "root", "Aa@9343@m");
		System.out.println("CONNECTION TO MYSQL ESTABLISHED.");
		String sql = "select * from batches where id = ?"; // ? is placeholder
		
		//Create the Medium 
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("Enter id of the Batch: ");
		int id = scan.nextInt();
		ps.setInt(1, id);  //(placeholder#, data)
		
		System.out.println("PREPARED STATEMENT CREATED.");
		
		//Query
		ResultSet rs = ps.executeQuery();
		System.out.println("QUERY EXECUTED.");
		
		//Display the Result
		System.out.println("RESULT SET: ");
		while(rs.next() == true) {
			System.out.println(rs.getInt("id") + " | " + rs.getString("batch") + " | " + rs.getInt("nos")); // can give column number also! instead of name
		}
		
		//Close the Resources
		rs.close();
		ps.close();
		con.close();
		scan.close();
		System.out.println("ALL RESOURCES CLOSED.");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
