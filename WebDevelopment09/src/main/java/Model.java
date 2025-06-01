import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Model { // Class for Database Logic
	Connection con = null;
	PreparedStatement pstmt = null;
	PreparedStatement pstmt2 = null;
	ResultSet rs = null;
	
	public Model() {
		//Initialization logic
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodapp", "root", "Aa@9343@m");
			System.out.println("Database Connection Successful.");
			
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//SignUp Logic (Insertion)
	public boolean performSignup(String id, String name, String password, String email, int phone) {
		try {
			pstmt = con.prepareStatement("insert into koduser values (?, ?, ?, ?, ?)");
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, password);
			pstmt.setString(4, email);
			pstmt.setInt(5, phone);
			
			int nora = pstmt.executeUpdate(); //update
			
			if (nora > 0) {
				System.out.println("Registration Successful.");
				return true;
			}
			else {
				System.out.println("Registration Failed.");
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false; //dummy
	}
	
	//Login Logic (Reading)
	public boolean performLogin(String id, String password) {
		try {
			pstmt2 = con.prepareStatement("select * from koduser where id = ? and password = ?");
			pstmt2.setString(1, id);
			pstmt2.setString(2, password);
			
			rs = pstmt2.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			else {
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false; //dummy
	}
	
	//Cleanup Logic 
	public void cleanUp() {
		try {
			if (rs != null)  rs.close();
			if (pstmt != null)  pstmt.close();
			if (pstmt2 != null)  pstmt2.close();
			if (con != null)  con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

// U have to add the mysql-connector (Driver) for this class to use. the connector jar present in the server is only for "Servlets"!!!!"
// But i didn't add. It's working!!!!!!