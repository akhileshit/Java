

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet { // Servlet Chaining (Different Servlets for Different Tasks)
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "Select * from student where id=?";
	PrintWriter pw = null;
	
	@Override
	public void init() throws ServletException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junekod?user=root&password=Aa@9343@m");
		pstmt = con.prepareStatement(sql);	
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) { //As usual removed the ducking of exception(for better readability) instead catching it inside-only and increased the visibility(since we can do that!)
		try {
		String id = req.getParameter("uid"); //getting the uid present in request-string
		int uid = Integer.parseInt(id);
		
		pstmt.setInt(1, uid);
		rs = pstmt.executeQuery();
		
		resp.setContentType("text/html");
		pw = resp.getWriter();
		if (rs.next()) {
			int i = rs.getInt(1);
			String name = rs.getString(2);
			int m1 = rs.getInt(3);
			int m2 = rs.getInt(4);
			int m3 = rs.getInt(5);
			
			pw.println(i + " " + name + " " + m1 + " " + m2 + " " + m3); //response from this(FirstServlet) servlet
			
			//Servlet Chaining______________________________________
			
			// Getting the session associated with the request if present or creating the new session.
			HttpSession hs = req.getSession(true);      //Returns the HttpSession associatedwith this request or null if create is false and the request has no valid session
			// Adding some data to the created session
			hs.setAttribute("id", i);
			hs.setAttribute("name", name);
			hs.setAttribute("m1", m1);
			hs.setAttribute("m2", m2);
			hs.setAttribute("m3", m3);
			
			// 
//			ServletContext sc = req.getServletContext();                  //Returns the servlet context to which this ServletRequest was lastdispatched (working same even for hs.getServletContext(), idk what this is. (May be not required!!!)
//			RequestDispatcher rd = sc.getRequestDispatcher("/SecondServlet");                   //to dispatch the req to another resource(here servlet) "/" is necessary to specify this as a path
//			rd.include(req, resp);                              //use forward() to just forward and not include the response of this servlet. use include() to include the resp of this servlet along with forwarding to another resource(here servlet). 
			
			// 1-liner
			req.getServletContext().getRequestDispatcher("/SecondServlet").include(req, resp);  
			
			
		}
		else {
			pw.println("INVALID ID. PLEASE TRY AGAIN");
		}
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {
		System.out.println("Servlet Undeployed");
		pw.close();
		rs.close();
		pstmt.close();
		con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//Wrote 2 servlets: FirstServlet & SecondServlet
//Wrote home.html & made it also as welcome-file for this project in web.xml

//09/12/24 - WebDev..07-08
//Terms to keep notice which is not used in these projects: <load-on-startup>, @webServlet("/xyz"), res.setContentType("text/html")..
//How does server isolates only the particular session stored? that's crazy.  [maybe ans: is in req.getSession()!.]

// end