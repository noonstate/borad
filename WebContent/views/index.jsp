<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String a = (String)request.getAttribute("test");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈페이지</title>
</head>
<body>
테스트입니다. <%=a %>

</body>
</html>