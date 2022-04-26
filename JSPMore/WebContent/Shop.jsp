<%@page import="java.util.ArrayList"%>
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
if(session.isNew()){
	session.setAttribute("Shopping_cart", new ArrayList<String>());
}
else{
	String item = request.getParameter("item");
	ArrayList<String> al =(ArrayList)session.getAttribute("Shopping_cart");
	al.add(item);
	session.setAttribute("shopping_cart", al);
	for(String purchased_item : al){
	%>
	
<li><%=purchased_item  %></li>

<%
}//end of for  
}//end of else

%>
<form >

Enter the item to the purchase :<select name="item" >
<option>milk</option>
<option>talk</option>
<option>shampoo</option>
<option>maggi</option>
<option>pen drive</option>
<option>mouse</option>
<option>suger</option>
<option>tea</option>
<option>lan cable</option>
</select> 
<input type="submit" value="ok" />
</form>
</body>
</html>