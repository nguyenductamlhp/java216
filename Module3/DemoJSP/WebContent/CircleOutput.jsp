<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%double R = Double.parseDouble(request.getParameter(("txtR")));%>
	<%double S = 3.14*R*R; %>
	<%double C = 3.14*R*2; %>
	dien tich = <%=Math.round(S) %>
	chu vi = <%=Math.round(C) %>
</body>
</html>