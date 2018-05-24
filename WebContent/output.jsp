<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your first and last name is : </h1>
	<%
		String firstname = (String) request.getAttribute("firstname");
		String lastname = (String) request.getAttribute("lastname");
		
		out.print(firstname + " " + lastname );
	%>

</body>
</html>