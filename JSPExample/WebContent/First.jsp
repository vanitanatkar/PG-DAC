<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 String v = request.getParameter("num");
  if(v!=null){
	
	int x = Integer.parseInt(v);

   for(int i=0;i<x;i++) {%>
 
<p> <%=i %> Hello </p>

<% 
}//end for
} //end of if
%>
  Hello from JSP !!!
</body>
</html>