<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>sign up page</title>
</head>
<body>
<center>
<br>
<br>
sign up  Details:
<br>
<form action="AddUserServlet" method="post">
<br>
First Name: <input type="text" id="fname" name="fname"/>
<br>
Last Name: <input type="text" id="lname" name="lname"/>
<br>
Email id: <input type="text" id="email" name="email"/>
<br>
Mobile: <input type="number" id="mob" name="mob"/>
<br>
Username: <input type="text" id="uname" name="uname"/>
<br>
Password: <input type="pass" id="uname" name="uname"/>
<br>
<br>
<input type="submit" value="save=Signup details" />
</form>

</center>


</body>
</html>