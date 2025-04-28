package mavenProjectmgmt.MavenProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App { // Just Creating a simple jdbc program, But by making use of P-M-T "Maven"
	
	
    public static void main(String[] args) {
    	Connection con = null;
    	Statement stmt = null;
    	ResultSet rs = null;
    	Scanner scan = new Scanner(System.in);
    	
        try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("DRIVER LOADED.");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june", "root", "Aa@9343@m");
		System.out.println("CONNECTION ESTABLISHED.");
		
		stmt = con.createStatement();
		
		rs = stmt.executeQuery("Select * from batches");
		
		System.out.println("RESULT : ");
		System.out.println("ID | BATCH | NOS ");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
		
        	
		} 
        catch (Exception e) {
			e.printStackTrace();
		}
        
        finally {
			try {
				rs.close();
				stmt.close();
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
// New Workspace
// Changed perspective to java.
/**
 * First clicked on create Maven-project
 * Then selected org.apache.maven.archetypes  maven-archetype-qui
 * Then gave group-id as "mavenProjectmgmt" (like package name)
 * Then gave artifact-id as "MavenProjects" (like project name)
 * Then itself creates one maven-project with a standard structure with App.java
 * Then go-to maven-repository and get xml-code for mysql-connector
 * Then paste that code in pom.xml under dependencies
 * Save it and maven "automatically" downloads added dependencies
 * Now you are good to go.
 */
