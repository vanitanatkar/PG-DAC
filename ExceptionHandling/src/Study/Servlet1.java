package Study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//here url request goes throw doGet
		//here v1 is requested input String which convert into integer and then print as it is a number
		int num= Integer.parseInt(request.getParameter("v1"));
		response.getWriter().append("you entered number "+num);
	}

	

}
