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
 * Servlet implementation class FetchResult
 */
public class FetchResult extends HttpServlet { // A Simple proper Full-Stack Website!! (Fetching data from DB using JDBC and displaying it in the browser "with user-input")
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String driverPath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/junekod";
	String user = "root";
	String pass = "Aa@9343@m";
	String sql = "Select * from student where id=?";
	PrintWriter pw = null;
	
	@Override
	public void init() {
		try {
		Class.forName(driverPath);
		con = DriverManager.getConnection(url, user, pass);
		pstmt = con.prepareStatement(sql);
		System.out.println("INIT EXECUTED");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
		String id = req.getParameter("id");
		int usn = Integer.parseInt(id);
		
		pstmt.setInt(1, usn);
		rs = pstmt.executeQuery();
		
		//Sending our response to the browser
		pw = res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head> <title> Your Results </title> </head>");
		pw.println("<body>");
		String name = "USER";
		pw.println("<h1 style='color:red' class='welcome-user'> WELCOME " + name + " CHECK YOUR RESULTS </h1>");
		pw.println("<br>");
		pw.println("<table border='1' > <tr>  <th>ID</th> <th>NAME</th> <th>M1</th> <th>M2</th> <th>M3</th>  </tr>");
		int i=0;
		if (rs.next()) {
			i=1;
			int id1 = rs.getInt(1);
			name = rs.getString(2);
			int m1 = rs.getInt(3);
			int m2 = rs.getInt(4);
			int m3 = rs.getInt(5);
			pw.println("<tr> <td>" + id1 + "</td><td>" + name + "</td><td>" + m1 +"</td><td>" + m2 + "</td><td>" + m3 + "</td> </tr>");
		}
		else {
			res.sendRedirect("invalidid.html");
		}
		
		pw.println("</table>");
		pw.println("<br> <br> <a href='http://localhost:8000/WebDevelopment06'>Go to Home</a>");
		if (i == 1) { // This is JS!!!
		pw.println("<script>");
		pw.println("const welcomeUser = document.querySelector('.welcome-user')");
		pw.println("const username = " + "'" + rs.getString(2).toUpperCase() + "'");
		pw.println("welcomeUser.textContent = `WELCOME ${username}, CHECK YOUR RESULTS`");
		pw.println("</script>");
		}
		pw.println("</body>");
		pw.println("</html>");
		System.out.println("SERVICE EXECUTED");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void destroy() {
		try {
		System.out.println("TATA BYE BYE... HOPE YOU ENJOYED USING OUR APP.");
		pw.close();
		rs.close();
		pstmt.close();
		con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

// Wrote(overrode) these 3 methods as usual
// removed some welcome-files in web.xml. Only added the page to be shown when the website loads!!
// wrote 2 seperate html files: invalidid.html, login.html
