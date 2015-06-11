<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.lineadecodigo.javaee.commons.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enviar array</title>
</head>
<body>

<h1>Enviar un array</h1>


Sus aficiones favoritas son:<br/>

<%
	
	String[] favoritos = request.getParameterValues("favoritos");
	
	for(String favorito: favoritos)
		out.println(favorito + "<br/>");
	
	out.println(WebInfo.pageURL(getServletContext(), "enviar-un-array-a-una-jsp"));

%>

</body>
</html>