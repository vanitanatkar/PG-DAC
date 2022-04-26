<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>

<html>
<head>

<title>Insert title here</title>
</head>
<body>
<%

List<String> list = Arrays.asList("red","green","yellow","Pink");
request.setAttribute("colors",list);

%>

${colors}
<br>
${colors[1]}

<table>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:forEach items="${colors}" var="col">
<tr>
<td>${col.toUpperCase()}</td>
 </tr>
 </c:forEach>
 </table>


</body>
</html>