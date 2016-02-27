<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng nhập</title>
</head>
<body style="background-color: silver;">
	<h1>HỆ THỐNG QUAN LÝ BÁN VÉ XE</h1>
	<h3>Đăng nhập</h3>
	<br><br><br>
	
	Tên đăng nhập :<input type="text" name = "txtUserName" style="text-align: center"><br>
	<br>
	Mật khẩu      :<input type="password" name = "txtPassWord" style="text-align: center"><br>
	<br>
	<form action="Login/LoginServlet.java">
		<input type="submit" value="Đăng nhập">
		<input type="checkbox" id="Remember">Ghi nhớ tài khoản
	</form>
	
</body>
</html>