package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.HibernateDao;
import study.Product;


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String desc = request.getParameter("desc");
		
		HibernateDao.updateProduct(id, desc);
  
		Product product = HibernateDao.ShowProd(id);
		
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
				pw.append("<html> <body>  ");
		pw.append("Product Id : " + product.getId());
		pw.append("<br>Product name : " + product.getName());		
		pw.append("<br>Product Desc : " + product.getDesc());
		pw.append("<br>Product Units : " + product.getQty());
		pw.append("<br>Product Cost : " + product.getCost());
		pw.append("<br>Product Exp.Date : " + product.getDate());
		pw.append("</body></html>");
		
	}

}
