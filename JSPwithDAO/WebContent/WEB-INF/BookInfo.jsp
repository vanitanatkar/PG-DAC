<%@ page import="Study.Dao.BookPojo" %>
<%@ page import="Study.Dao.BookDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form>
Enter the book id<input type="number" name="id" />
<input type="submit" value="show_bk_info" />
</form>

<%
    String id = request.getParameter("id");
    if(id != null)
    {
    	//call the DAO, get the POJO
    	BookDao dao= new BookDao();
    	dao.getBookInfo(Integer.parseInt(id));
    	
    	BookPojo pojo = dao.getBookInfo(Integer.parseInt(id));
    	
 %>
 <%=pojo %>
 
  <%   }  //end if %> 

</body>
</html>