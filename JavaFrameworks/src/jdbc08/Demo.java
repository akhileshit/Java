package jdbc08;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;


public class Demo { // Calling Stored Procedures
	
	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DRIVER LOADED.");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodbank?user=root&password=Aa@9343@m");
			System.out.println("CONNECTION ESTABLISHED.");
			
			cstmt = con.prepareCall("call new_procedure(?)");  // A query calling Stored Procedure!!
			System.out.println("CALLABLE STATEMENT CREATED.");
			System.out.println("Enter acc no.");
			int acc = scan.nextInt();
			cstmt.setInt(1, acc);
			
			boolean result = cstmt.execute(); // only "execute()" becaz we may don't know what type queries are written inside stored procedures(when we don't know we use execute())
			if (result == true) {
				System.out.println("RESULT: ");
				rs = cstmt.getResultSet(); //getResultSet()
				while (rs.next()) {
					System.out.println("========");
					System.out.println(rs.getInt("accNo") + " | " + rs.getString("name") + " | " + rs.getInt("balance"));
					System.out.println("========");
				}
			}
			else {
				int nora = cstmt.getUpdateCount(); //getUpdateCount()
				System.out.println(nora + " ROWS AFFECTED.");
			}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				cstmt.close();
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
