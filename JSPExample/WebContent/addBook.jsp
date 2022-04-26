
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method=post>
Book Id<input type="number" name="id" />
Book cost<input type="number" name="cost" />
Book name<input type="text" name="name" />
         <input type="submit" value="ok" />
</form>
<%
String id = request.getParameter("id");
String cost = request.getParameter("cost");
String name = request.getParameter("name");

if(id!=null){
	Class.forName("com.mysql.cj.jdbc.Driver");
	String jdbc_url = "jdbc:mysql://localhost:3306/bookshop"; //bookshop and db1
	String uname ="root";
	String pass= "Root";
	Connection con = DriverManager.getConnection(jdbc_url, uname, pass);
	System.out.println("connection DB is Successfull "+con);
	
	String sql = "insert into book values(?,?,?)"; 
	PreparedStatement pstmt=con.prepareStatement(sql);
	
	pstmt.setInt(1, Integer.parseInt(id));
	pstmt.setInt(1, Integer.parseInt(cost));
	pstmt.setString(3, name);
	
	
	pstmt.executeUpdate();
	
}%>
</body>
</html>