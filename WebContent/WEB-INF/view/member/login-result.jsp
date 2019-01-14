<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
 	String id = request.getParameter("id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ID : <%= id %> 님 로그인 성공하셨습니다.</h1>
	<a href="../index.jsp">홈으로</a>
	<a href="main.jsp">회원가입하기</a>
</body>
</html>