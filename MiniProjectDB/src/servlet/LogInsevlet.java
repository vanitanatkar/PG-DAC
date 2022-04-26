package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.DBManager;
import pojo.User;


@WebServlet("/LogInsevlet")
public class LogInsevlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User nuser = new User();
		nuser.setUsername(request.getParameter("uname"));
		nuser.setPassword(request.getParameter("pass"));
		
		
		/*String uname= request.getParameter("uname");
		String pass = request.getParameter("pass");*/
		
		
		//System.out.println(uname+" "+pass);
		System.out.println(nuser.getUsername()+" "+nuser.getPassword());
		
		//verify with DB
		DBManager dbManager = new DBManager();
		if(dbManager.validateUser(nuser) == true)
		{
			//valid user==redirect to welcome.jsp
			
			//request.setAttribute("User", uname);	//set input given uname && then get it in welcome.jsp---this request is forwarded only till loginservlet is being forwarded-----&& if u want to see 'uname' throughout all so many pages then use session
			
			HttpSession session = request.getSession();
			session.setAttribute("User", nuser);
			
			ServletContext context = super.getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/welcome.jsp");
			rd.forward(request, response);
		}
		else
		{
			//Invalid user===redirect to error.jsp
			ServletContext context = super.getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
