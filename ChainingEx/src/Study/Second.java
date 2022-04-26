package Study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second
 */
@WebServlet("/Second")
public class Second extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String firstLine = (String)request.getAttribute("line1"); //downcasting of String  and here get first line from First servlet  to the second servlet
	
	String  poem_more = firstLine +"<br>"+"How I wonder what you are";//modified data 
	
	request.setAttribute("poem", poem_more);//added name value pair to the request
	RequestDispatcher rd = super.getServletContext().getRequestDispatcher("/Third");//request send to the third servlet here
	
	rd.forward(request, response);
	
	
	}


}
