
//10/12/24

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
// Servlet for Login (Controller Logic)
public class LoginController extends HttpServlet { // Model-View-Controller (MVC Architecture)   (A Design Pattern but Architectural Design Pattern)
	Model model;
	
	@Override
	public void init() {
		model = new Model();
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
		String id = req.getParameter("userid");
		String password = req.getParameter("password");
				
		boolean success = model.performLogin(id, password);
		
		if (success) {
			res.sendRedirect("dashboard.html");
		}
		else {
			res.sendRedirect("Invalid.html");
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		model.cleanUp();
	}
}

//10/12/24     WebDev.09
//Assig:  load-on-startup(wap to show its usage), servlet-filter, Java-Server-Pages(jsp)
// Till Now  we were writing all logics html, database everything inside servlet. It's good to write those seperately.
// Hence MVC Architecture : Model(Database Logic), View(frontend code) & Controller(connects & controls both model and view!)
// This project is full-stack with MVC architecture.

//end


/*
 *  Assig:
 *  JSP:  HTML with Embedded java code!!!
 *  	At runtime server converts jsp into servlet internally!!!! OMG
 *  	Not used today.....
 *  Servlet-Filter:  Filter in Java Servlet API is an object that 
 *  	intercepts requests and responses "before" they reach a servlet "or" "after" the servlet processes them.
 */
