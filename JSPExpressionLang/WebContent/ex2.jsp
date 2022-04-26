<%@ page import="Study.RandomNumber" %>
<!DOCTYPE html>
<html>
<head>
<meta >
<title>Insert title here</title>
</head>
<body>
<h1>ex2.jsp</h1>
page level=<%= pageContext.getAttribute("greeting") %>
<br>
request level=<%=request.getAttribute("song") %>
<br>
session level=<%=session.getAttribute("country") %>
<br>
application level=<%=application.getAttribute("proverb") %>
<br>
application =<%=((RandomNumber)application.getAttribute("random")).getRandomNumber() %>
<%//there are four scope of variable in JSp expression lang %>

</body>
</html>