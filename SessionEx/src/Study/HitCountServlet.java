package Study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/hits")
public class HitCountServlet extends HttpServlet {
	
	private int globalcount=0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//for every user request will come with different session ID
		//so every user get different session object
		
		HttpSession session = request.getSession();
		System.out.println("Session Id "+session.getId());
		
		
		int c = 0;
		if(session.isNew()) {
			c = 1;
			session.setAttribute("count", 1);//this is the inside the map
		}

		else {
			
			 c = (int) session.getAttribute("count");
			c++;
			
			session.setAttribute("count", c);
		}
		
		
		response.setContentType("text/html");
		response.getWriter().append("This user visited the side "+c+" times");
		response.getWriter().append("<br>Total hits to the site"+ ++globalcount +" times");
	    response.getWriter().append("<a href='logout'>logout</a>");
	
	
	
	}

	

}
