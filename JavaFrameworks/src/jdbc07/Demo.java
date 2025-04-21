package jdbc07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo { // Maintaining all ACID properties for a Transaction  (All-Or-Nothing)
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DRIVER LOADED.");
			
			// Establishing the Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodbank?user=root&password=Aa@9343@m"); // kodbank DB
			System.out.println("CONNECTION ESTABLISHED.");
			
			// Creating the Medium (Prepared Statement)
			pstmt1 = con.prepareStatement("update transactions set balance=balance-? where accNo=?");
			pstmt2 = con.prepareStatement("update transactions set balance=balance+? where accNo=?");
			System.out.println("PREPARED STATEMENTS CREATED.");
			System.out.println("Enter From-acc-no. & To-acc-no & amount to transfer: ");
			int facc = scan.nextInt();
			int tacc = scan.nextInt();
			int amt = scan.nextInt();
			pstmt1.setInt(1, amt);
			pstmt1.setInt(2, facc);
			pstmt2.setInt(1, amt);
			pstmt2.setInt(2, tacc);
			
			// Execute the Query
			con.setAutoCommit(false);           // Disabling Auto-Commit
			int rs1 = pstmt1.executeUpdate();
			int rs2 = pstmt2.executeUpdate();
			
			// Display the Result
			System.out.println("QUERY EXECUTED.");
			System.out.println("MONEY TRANSFER SUCCESSFUL.");
			System.out.println(rs1 + " " + rs2);
			con.commit();                        // Commit @ last (only after a complete transaction)
		}
		
		catch(Exception e) { 
			//e.printStackTrace();
			//Its time to change the code inside a catch block!!!!
			try {
				System.err.println("TRANSACTION FAILED.");
				con.rollback();
				System.out.println("DON'T WORRY. YOUR MONEY IS SAFE WITH THE KODBANK.");
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
		// Close the Resources
		finally {
			try {
				pstmt1.close();
				pstmt2.close();
				con.close();
				scan.close();
				System.out.println("ALL RESOURCES CLOSED.");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
