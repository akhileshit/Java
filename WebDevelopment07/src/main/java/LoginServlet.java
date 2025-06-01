
//09/12/24

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet { // Using doGet() or doPost() or service()!
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "Select * from student where id=? and pwd=?";
	PrintWriter pw = null;
	
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/juneuser?user=root&password=Aa@9343@m");
			pstmt = con.prepareStatement(sql);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Logic that we were writing inside service() before.   service(), doGet(), doPost() all does the same job. Don't worry
	public void doPost(HttpServletRequest req, HttpServletResponse res)  {
		try {
		String id = req.getParameter("uid");  //"uid" getting from the request-string from the form submitted using login.html
		String pwd = req.getParameter("upwd"); //"upwd" getting from the request-string "
		
		int uid = Integer.parseInt(id);
		int upwd = Integer.parseInt(pwd);
		
		pstmt.setInt(1, uid);
		pstmt.setInt(2, upwd);
		rs = pstmt.executeQuery();
		
		pw = res.getWriter();
		if (rs.next()) {
			res.sendRedirect("dashboard.html");
		}
		else {
			res.sendRedirect("invalidid.html");
		}
		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {
		System.out.println("Servlet Undeployed.");
		if (pw != null)  pw.close();
		if (rs != null)  rs.close();
		pstmt.close();
		con.close();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}


//Overrode the doGet() method instead of service() here.
//All 3 methods service(), doGet(), doPost() does the same job. But doPost() does the show the data entered inside request string to the user after login is successful.(Maintaining security!!!)
//For doGet() just add one attribute method="get" inside <form> tag to specify to use doGet() method inside the specified servlet.
/////ly For doPost() just add one attribute method="post" (make sure to edit this whereever u hv written)
// If doGet or doPost methods are not written, service method is used BY DEFAULT. (obviously any 1 shd be written)   [More precisely service() acts as delegate for doPost() & doGet()]

// Wrote dashboard.html, invalidid.html, login.html along with this servlet.
// invalidid.html is same as login.html page but with one extra message..
// Specified "login.html" as a welcome-file inside web.xml  (which is the server's  notebook!)
