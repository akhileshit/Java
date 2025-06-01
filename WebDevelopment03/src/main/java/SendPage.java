

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendPage
 */
public class SendPage extends HttpServlet { // Sending whole .html file as Response
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			res.sendRedirect("dashboard.html"); // (or) /WebDevelopment03/dashboard.html    (instructs the client's browser to make a new request to different url specified.) HTTP Status code: 302(Found)
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// wrote dashboard.html file seperately inside 'webapp' folder
// sendRedirect() 'typically' used to redirect a user to login page if they try to access a restricted area w/o being authenticated.