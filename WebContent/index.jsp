<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="spring/mvc">hello world</a>
	<br></br>
	<a href="spring/mvc/method/get">mvc method get</a>
	<br></br>
	<form action="spring/mvc/method/post" method="POST">
		<input type="submit" value="mvc method post"></input>
	</form>
	<br></br>
	<a href="spring/mvc/params?username=Kate&age=20">mvc params</a>
	<br></br>
	<a href="spring/mvc/headers?username=Kate&age=20">mvc headers</a>
	<br></br>
	<a href="spring/mvc/ant/xx/yy/zz/mm/nn/a">mvc ant</a>
	<br></br>
	<a href="spring/mvc/pathvariable/100">mvc PathVariable</a>
</body>
</html>