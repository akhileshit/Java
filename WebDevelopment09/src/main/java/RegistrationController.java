

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
// Servlet for Registration (Controller Logic)
public class RegistrationController extends HttpServlet { // Model-View-Controller (MVC Architecture)
	Model model;
	
	@Override
	public void init() {
		model = new Model();
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
		String id = req.getParameter("userid");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		int phone = Integer.parseInt(req.getParameter("phone"));
		
		boolean success = model.performSignup(id, name, password, email, phone);
		
		if (success) {
			res.sendRedirect("login.html");
		}
		else {
			res.sendRedirect("SignUp.html");
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		model.cleanUp();
		System.out.println("Servlets Undeployed.");
	}

}
