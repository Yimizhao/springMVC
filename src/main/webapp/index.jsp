<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="springMVC/testModelAttribute" method="post">
		<input type="hidden" name="id" value="1">
		<br>
		uername:<input type="text" name="username" value="Jock"/>
		<br>
		email:<input type="text" name="email" value="Jock@zym.com"/>
		<br>
		age:<input type="text" name="age" value="25"/>
		<br>
		<input type="submit" value="Submit">

	</form>
	<br>
	<br>
	<a
		href="springMVC/testSessionAttributes">Test SessionAttributes</a>
	<br>
	<br>
	<a
		href="springMVC/testModelAndView">Test ModelAndView</a>
	<br>
	<br>
	<form action="springMVC/testPojo" method="post">
		uername:<input type="text" name="username" />
		<br>
		password:<input type="password" name="password" />
		<br>
		email:<input type="text" name="email" />
		<br>
		age:<input type="text" name="age" />
		<br>
		province:<input type="text" name="address.province" />
		<br>
		city:<input type="text" name="address.city" />
		<br>
		<input type="submit" value="Submit">
	</form>
	<br>
	<br>
	<a
		href="springMVC/testRequestara?username=zhaoyingming&password=123456">Test
		Requestara</a>
	<br>
	<br>
	<a href="springMVC/testRest/5">Test Rest GET</a>
	<br>
	<br>
	<form action="springMVC/testRest" method="post">
		<input type="submit" value="testRest post">
	</form>
	<br>
	<br>
	<form action="springMVC/testRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE" /> <input
			type="submit" value="TestRest DELETE" />
	</form>
	<br>
	<br>
	<form action="springMVC/testRest/3" method="post">
		<input type="hidden" name="_method" value="PUT"> <input
			type="submit" value="testRest PUT">
	</form>
	<br>
	<br>
	<a href="springMVC/testpathVariable/5">Test Pathvariable</a>
	<br>
	<br>
	<a href="springMVC/testRequestMapping">Test requestMapping</a>
	<br>
	<br>
	<a href="helloWorld">hello World</a>
	<br>
	<br>
	<a href="springMVC/testMethod">testMethod</a>
	<br>
	<br>
	<form action="springMVC/testMethod" method="post">
		<input type="submit" value="Submit">
	</form>
</body>
</html>