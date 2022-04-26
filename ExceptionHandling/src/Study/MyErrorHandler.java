package Study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@WebServlet("/myerror")
public class MyErrorHandler extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest res, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/Html");
		
		resp.getWriter().append("<b>The value of v1 should be number<br>");

		
	}

}
