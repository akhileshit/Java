

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet { // Different Servlet Created for Different Task (calculating percentage)
	
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) {  //Only service() is enough
		try {
		// Get the present Session from the request (created by FirstServlet)
		HttpSession hs = req.getSession();
		// Get the data present in the Session  (added by FirstServlet)
		int m1 = (int)hs.getAttribute("m1");
		int m2 = (int)hs.getAttribute("m2");
		int m3 = (int)hs.getAttribute("m3");
		
		float percentage = ((float)(m1 + m2 + m3)/300) * 100;
	
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html"); //this makes the difference (if specified the content wrote to output stream pw.println will be html or else not!)
		pw.println("<br/><br/>");
		pw.println("PERCENTAGE IS " + percentage + "%"); //response from this(SecondServlet) servlet
		pw.close();
		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
