package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.DBManager;
import pojo.Hobby;
import pojo.User;


@WebServlet("/AddhobbyServlet")
public class AddhobbyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User currentUser = (User)session.getAttribute("User");
			
			Hobby hb = new Hobby();
			
			//no 3rd field as id is autoincrement
			hb.setHobby(request.getParameter("hobby"));
			hb.setUserid(currentUser.getId());
		
			DBManager mgr = new DBManager();
			mgr.addHobby(hb);
			
			response.sendRedirect("welcome.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
