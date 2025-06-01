// 05/12/24   (02-04 No class)

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Greet
 */
public class Greet extends HttpServlet { // Sending 
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			PrintWriter pw = res.getWriter(); //getWriter()
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("<head> <title> Greetings </title> </head>");
			pw.println("<body>");
			pw.println("<h1> HELLO USER WELCOME TO THE FIRST SERVLET APP </h1>");
			pw.println("</body>");
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
28th was HibernateProject...
29/11/24 started with web-development
	downloaded web-server software Apache Tomcat 9. (for all web-dev project done in future)
	changed perspective t java EE
	created new- Dynamic Web Project
	target runtime - path to tomcat9 folder
	choosed dynamic web module version 2.4
	
	Assig: told to konw completely about GenericServlet class/interface/...?
*/

//05/12/24
// Created this Servlet (Don't create class and extend HttpServlet. Just create New Servlet itself(They said) [becaz to fill web.xml automatically]
// Remove all the auto generated code inside our Servlet 'for now' (not required)
// "NO MAIN METHOD, NO JVM. NOTHING" everything is taken care by the Master(The Showman)-  "Web Container" (Which is directly inside Tomcat server)
// And inside that Web Container we have(deploy) our project , inside which we have our servlets, html docs, web.xml,....
// Web-Container knows all about the application by reading the web.xml file inside the project!.(web.xml was automatically wrote by our dynamic web project to us!)
// override the service() method of servlet and write your business logic there.

// 1st this application(project) failed to run on server saying invalid ports
// So i edited server.xml file in tomcat installation folder (conf)....(made shoutdown port from -1 to 8001). -1 is not good.
// u can also change running port below that to anything u want (free ports)
// right-click on the project itself and run-on-server by choosing appropriate server.