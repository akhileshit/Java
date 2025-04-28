package hibernate01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo { // Inserting Objects data into Database using JDBC.
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the id, name, age, marks and gender for a Student : ");
		Student stu = new Student(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("DRIVER LOADED.");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest?user=root&password=Aa@9343@m");
		System.out.println("CONNECTION ESTABLISHED.");
		
		pstmt = con.prepareStatement("insert into student values (?,?,?,?,?)");
		// See How Difficult it is................
		// We Are Literally Resolving the Object's Data 1-by-1 and Assigning it to the pstmt's Placeholder.
		// Even When We Have to Retrieve it We Have to do the Reverse of this. Taking the ResultSet's Data 1-by-1 and assigning it the Object's instance variable to create an Object out of it!!!! DAMN.....
		pstmt.setInt(1, stu.id);
		pstmt.setString(2, stu.name);
		pstmt.setInt(3, stu.age);
		pstmt.setInt(4, stu.marks);
		pstmt.setString(5, stu.gender);
		
		int nora = pstmt.executeUpdate();
		
		System.out.println(nora + " ROW(S) AFFECTED.");
		
		pstmt.close();
		con.close();
		scan.close();
		System.out.println("RESOURCES CLOSED.");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
