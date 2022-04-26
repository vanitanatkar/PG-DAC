<%@ page import="Study.RandomNumber" %>
<!DOCTYPE html>
<html>
<head>
<meta >
<title>Insert title here</title>
</head>
<body>
<h1>ex1.jsp</h1>
<%
application.setAttribute("random", new RandomNumber(50));
pageContext.setAttribute("greeting", "Good Morning");
request.setAttribute("song", "laalal..laal...lalaaa");
session.setAttribute("country","India");
application.setAttribute("proverb", "Work while u work and play while u play");


%>
page level=<%= pageContext.getAttribute("greeting") %>
<br>
application level=<%=application.getAttribute("proverb") %>
<br>
request level=<%=request.getAttribute("song") %>
<br>
session level=<%=session.getAttribute("country") %>


<br>-----------------------------------

<jsp:include page="ex2.jsp" />
</body>
</html>