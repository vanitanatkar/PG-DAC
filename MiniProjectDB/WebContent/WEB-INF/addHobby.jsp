<%@page import="pojo.User"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add Hobby page</title>
</head>
<body>
<%

User nuser = (User) session.getAttribute("User");
String user_name = nuser.getFname() + " "+nuser.getLname();
%>

Welcome <%=user_name %>

<br>
add Hobby page
<br><br>
<form action="addHobbyServlet">
<input type="text" name="hobby" id="hobby"/>
<input type="submit" value="ADD"/>

</form>
</body>
</html>