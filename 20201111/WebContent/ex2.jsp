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
		Cookie cookie = new Cookie("id", "asdf");
		cookie.setMaxAge(60*60*24); // 24시간 저장
		response.addCookie(cookie);
	%>
	<form action="ex2_checked.jsp">
		<input type="submit value=" 쿠키확인"/>
	</form>
</body>
</html>