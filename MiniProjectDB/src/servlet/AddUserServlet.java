package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBManager;
import pojo.User;


@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User nuser = new User();
		//fetch data coming from html/jsp page.....
		nuser.setId(Integer.parseInt(request.getParameter("uid")));
		nuser.setFname(request.getParameter("fname"));
		nuser.setLname(request.getParameter("lname"));
		nuser.setEmailId(request.getParameter("id"));
		nuser.setMobileNo(request.getParameter("mob"));
		nuser.setUsername(request.getParameter("uname"));
		nuser.setPassword(request.getParameter("pass"));
	
			
			DBManager dbManager = new DBManager();
			dbManager.addUser(nuser);
			
			response.sendRedirect("index.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
