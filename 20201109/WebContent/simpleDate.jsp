<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="include.html"%>
	<%
		Date today = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyymmdd");
	SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");

	out.println("sdf1 = " + sdf1.format(today));
	out.println("sdf2 = " + sdf2.format(today));
	%>
</body>
</html>