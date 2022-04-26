<%@ page contentType="text/html; charset=ISO-8859-1"
    errorPage="error.jsp" isErrorPage="false" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="ISO-8859-1" >
<title>Insert title here</title>
</head>
<body>
<%
if(1<2)//always true
{
 throw new Exception();
}
//for import we use page directive  we cans use it also for error page setting
//here if error then goto ehandler
%>
Hello
</body>
</html>