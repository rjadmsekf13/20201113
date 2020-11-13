<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	input
	{
	margin-top: 10px;
	margin-bottom: 10px;
	
	font-size: 20px;
	background-color: red;
	}
	#sub
	{
		margin-left: 30px;
	}
</style>
</head>
<body>
<form id="frm" action="Bmove" method="get">
	a = <input type="text" name="a"/><br>
	b = <input type="text" name="b"/><br>
	<input id="sub" type="submit" value="확인"/>
</form>
</body>
</html>
<script type="text/javascript">
	var a = document.getElementById("sub").onclick = function()
	{
		alert("잘되는건가...");
		document.getElementById("frm").submit();
	}
</script>