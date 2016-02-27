<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% int xA, yA, xB, yB; %>
	<%xA = Integer.parseInt(request.getParameter("txtxA")); %>
	<%yA = Integer.parseInt(request.getParameter("txtyA")); %>
	<%xB = Integer.parseInt(request.getParameter("txtxB")); %>
	<%yB = Integer.parseInt(request.getParameter("txtyB")); %>
	
	<% double D = Math.sqrt((xA-xB)*(xA-xB) + (yA-yB)*(yA-yB)); %>
	
	Khoang cach: <%=Math.round(D) %>
</body>
</html>