package Study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(loadOnStartup=1,urlPatterns = "/TestServlet")  //target is type means apply for class and Runtime mean it will retain up to the End

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	
	
	public static Connection makeConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("the driver class is not found in the classpath");
		}
		String jdbc_url = "jdbc:mysql://localhost:3306/db1"; //bookshop and db1
		String uname ="root";
		String pass= "Root";
		
		Connection con=null;
		try {
			con = DriverManager.getConnection(jdbc_url, uname, pass);
		} catch (SQLException e) {
			
			System.out.println("could not counnect to DB "+e);
		}
		return con;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
				PrintWriter pw = response.getWriter();
		
		Connection con= TestServlet.makeConnection();
		try {
			Statement stmt = con.createStatement();
			String sql = "select * from books";
			ResultSet rs =stmt.executeQuery(sql);
			
			//processing the result set
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String type =  rs.getString(3);
				int cost = rs.getInt(4);
				
				
				pw.println("<p>"+id+" "+name+" "+type+" "+cost+"</p>");	
			}		
		} catch (SQLException e) {
			System.out.println(e);
		}
		pw.close();
	}

}
/*
Sticker=WebServlet
target=Type=(Class/Interface)
Applied by=programmer
Read by = Tomcat container during deployment
*/