<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a = 10;
	int b;
	b = 20;
	
	int c = 20;
	byte d = (byte)c;
	
	out.println("a = "+ a +"<br/>");
	out.println("b = "+ b +"<br/>");
	
	out.println(a+ " + " + b + " = "+ (a+b));
%>
</body>
</html>