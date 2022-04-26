<%@page import="pojo.User"%>
<%@page import="java.util.List"%>
<%@page import="pojo.Hobby"%>
<%@page import="db.DBManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view Hobby page</title>
</head>
<body>


view Hobby page


<%
User nuser = (User) session.getAttribute("User");
String user_name = nuser.getFname()+" "+nuser.getLname();
%>

Welcome <%=user_name %>

<table>
<thead>
<tr><th>User ID</th><th>User FirstName</th><th>User LastName </th><th>Email </th><th>Mobile no.</th><th>Username</th><th>Password</th></tr>
</thead>
<tbody>
<%
//call dao,make obj of pojo
DBManager userdao = new DBManager();
List<Hobby> hlist =  userdao.viewAllHobby();
for(Hobby h : hlist) {%>
	
	<tr><td><%=h.getId()%></td><td><%=h.getUserid() %></td><td><%=h.getHobby() %></td></tr>
	
<%}	//end of for %>
	


</tbody>
</table>

</body>
</html>