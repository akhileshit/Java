// 06/12/24
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetResults
 */
public class GetResults extends HttpServlet { // A Simple Full-Stack website using JDBC & MYSQL w/o user input
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	String driverPath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/junekod";
	String user = "root";
	String pass = "Aa@9343@m";
	String sql = "Select * from student";
	PrintWriter pw = null;
	
	@Override
	public void init() {
		try {
		Class.forName(driverPath);
		con = DriverManager.getConnection(url, user, pass);
		stmt = con.createStatement();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
		pw = res.getWriter();
		rs = stmt.executeQuery(sql);
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head> <title> Your Results </title> </head>");
		pw.println("<body>");
		pw.println("<h1 style='color:red'> WELCOME USER CHECK YOUR RESULTS </h1>");
		pw.println("<br>");
		pw.println("<table> <tr><th>ID</th><th>NAME</th><th>M1</th><th>M2</th><th>M3</th></tr>");
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int m1 = rs.getInt(3);
			int m2 = rs.getInt(4);
			int m3 = rs.getInt(5);
			pw.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + "</td><td>" + m1 + "</td><td>" + m2 + "</td><td>" + m3 + "</td></tr>");
		}
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
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
		stmt.close();
		con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		pw.close();
		
	}
}

//06/12/24 (web05-06)
// But we have to specify this servlet name when website loads as before
// where to add mysql-connector??  It's  inside the server library!!!!!. Since it is the master which takes responsibility completely