

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
public class LifeCycle extends HttpServlet { //Life Cycle methods any Servlet: init(), service(), destroy() 
	
	@Override
	public void init() {
		System.out.println("THIS IS INIT METHOD AND INIT GOT EXECUTED");
	}
	
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("THIS IS SERVICE METHOD AND GOT EXECUTED");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("THIS IS DESTROY METHOD AND GOT EXECUTED");
	}
}


// Just write these lifecycle methods of servlet and ur done. 
// Everything.... like creating our servlet objects and calling the methods.. are all taken care by the web-container.
// U can observe that all the lifecycle methods are instance methods and not static. So the object of this servlet class is necessary to call these mehtods and is done by our Web-Container.
// init() and destroy() are executed ONLY ONCE. init() When you first run this project on the server &  destroy() when you de-deploy(remove) your servlet from the server (not just stop)  [u hv to see these in the Deployment perspective]
// The service() is called everytime "any request" made from the page. So it runs many times.
//Conclusion:
// write initialization logic inside init()
// write business logic (all logic for your application) inside service()
// write all resource cleanup logic inside destroy method

// By the way, we also saw inbuilt web-browser inside eclipse!