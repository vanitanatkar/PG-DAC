package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insert_student")
public class HibernateInsert extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int roll =Integer.parseInt(request.getParameter("roll"));
		String name = request.getParameter("Student_name");
		
		//HibernateDao dao= new HibernateDao;
		
		
	}


}
