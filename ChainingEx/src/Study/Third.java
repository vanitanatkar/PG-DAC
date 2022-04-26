package Study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Third
 */
@WebServlet("/Third")
public class Third extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String poem = (String)request.getAttribute("poem"); //added name value pair to the request
	
	String finalPoem = poem+"<br>"+"up abouve the world so high";
	
	response.setContentType("text/html");// if we not writre this <br> print as it in the O/P file
	response.getWriter().append(finalPoem); //here we use print writer  to print poem
	
	
	}

	
}
