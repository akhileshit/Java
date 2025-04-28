package mavenProjectMgmt.MavenProject01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App { // Just Creating a simple jdbc program, But by making use of P-M-T "Maven"
	
	// First add ojdbc(driver) dependency to pom.xml (get xml code from maven-repository)
	// ojdbc8 xml-code was used here
    public static void main(String[] args) {
    	Connection con = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	Scanner scan = new Scanner(System.in);
    	
    	// So far we have seen in MySql. Let's try using Oracle.
        try {
        // Oracle Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("DRIVER LOADED.");
		
		// Oracle Connection url
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "mydatabases", "system"); //service-name is specified instead of database in oracle.
		System.out.println("CONNECTION ESTABLISHED.");
		
		pstmt = con.prepareStatement("Select * from result where id = ?");
		System.out.println("Enter the id of a Student.");
		int roll = scan.nextInt();
		pstmt.setInt(1, roll);
		
		rs = pstmt.executeQuery();
		
		System.out.println("RESULT : ");
		System.out.println("ID | NAME | M1 | M2 | M3 | M4 | PER");
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int m1 = rs.getInt(3);
			int m2 = rs.getInt(4);
			int m3 = rs.getInt(5);
			int m4 = rs.getInt(6);
			double per = ((double)(m1+m2+m3+m4)/400) * 100;
			System.out.println(id + " " + name + " " + m1 + " " + m2 + " " + m3 + " " + m4 + " " + per + "%");
		}
		
        	
		} 
        catch (Exception e) {
			e.printStackTrace();
		}
        
        finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
				scan.close();
				System.out.println("RESOURCES CLOSED.");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
}
//JDBC program:
//Here we are fetching the student details based on their id specified and calculating their percentage and printing it with their details.