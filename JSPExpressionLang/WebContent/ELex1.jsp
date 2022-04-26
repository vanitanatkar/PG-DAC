<%@ page import="Study.RandomNumber" %>
<!DOCTYPE html>
<html>
<head>
<meta>
<title>Insert title here</title>
</head>
<body>
<h1>ELex1.jsp</h1>

<br>
request level=${song}
<br>
session level=${sessionScope.country}
<br>
application level=${ applicationScope.proverb}
<br>
application =${applicationScope.random.getRandomNumber() }

</body>
</html>