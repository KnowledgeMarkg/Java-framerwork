<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<element>
		<body>
			<%request.setAttribute("name", "Kausar");%>

			<h2>Hello : ${requestScope.name}</h2>
			
			<%session.setAttribute("sessionCname", "knowledgemarkz");%>
			
			<h3>Company Name : ${sessionCname}</h3>
		</body>
	</element>
</html>