<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String sn = request.getParameter("somename");

StringBuffer sb= new StringBuffer(sn);

sb.reverse();

if(sn.equals(sb.toString())){
	
%>
	<jsp.forward page="welcome.jsp" /> 
<% } //end of if
else{
%>	
  <jsp:forward page="one.jsp" >
  <jsp.param value="not a palindrome, try again" name="message" />
</jsp:forward>
  <% }%>  

</body>
</html>