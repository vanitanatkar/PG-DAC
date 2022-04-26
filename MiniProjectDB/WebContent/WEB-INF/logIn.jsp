<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body bgcolor="pink">
<center>
<br>
<br>
Login Details:
<br>
<form action="LoginServlet" method="post">
<br>
Username: <input type="text" id="uname" name="uname"/>
<br>
Password: <input type="password" id="pass" name="pass"/>
<br>
<br>
<input type="submit" value="Submit" />
</form>

</center>


</body>
</html>