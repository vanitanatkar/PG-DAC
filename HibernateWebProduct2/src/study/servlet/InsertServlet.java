package study.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.HibernateDao;



@WebServlet("/product_Insert")
public class InsertServlet extends HttpServlet {



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int cost = Integer.parseInt(request.getParameter("cost"));
		String desc = request.getParameter("desc");
		int qty = Integer.parseInt(request.getParameter("qty"));
		String date = request.getParameter("date");
        
		HibernateDao.AddProduct(id, name, cost, desc, qty, date);
		

	}

}
