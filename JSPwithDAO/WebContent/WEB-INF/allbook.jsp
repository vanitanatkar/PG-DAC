<%@ page import="Study.Dao.BookPojo" %>
<%@page import="java.util.List"%>
<%@page import="Study.Dao.BookDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1>  
<thead>
<tr><th>Book id</th><th>Book cost</th><th>Book name</th></tr>
</thead>
<tbody>
<%  BookDao dao =new BookDao();
List<BookPojo> list = dao.getAllBooks();

for(BookPojo bp	: list){
%>
	<tr><td><%=bp.getId() %></td> <td><%=bp.getCost() %></td><td><%=bp.getName()%></td></tr>
<%}

%>
</tbody>
</table>
</body>
</html>