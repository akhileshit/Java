

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendPage
 */
public class SendPage extends HttpServlet { // Sending whole .html file as Response
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			res.sendRedirect("dashboard.html"); // (or) /WebDevelopment03/dashboard.html
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// wrote dashboard.html file seperately