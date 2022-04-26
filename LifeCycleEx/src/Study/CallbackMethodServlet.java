package Study;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CallbackMethodServlet extends HttpServlet {

      public CallbackMethodServlet()
      {
    	  System.out.println(" NOARGS constructor called ");
      }
      
      @Override
    public void init() throws ServletException {
    	System.out.println("init Called");
    }
      
   /*    
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
    	
    	System.out.println("service called");
    }*/
      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println(req.getMethod()+"is called");
    }
      
      @Override
    public void destroy() {
    	  
    System.out.println("destroy Called");
    }
      

}//end of servlet
