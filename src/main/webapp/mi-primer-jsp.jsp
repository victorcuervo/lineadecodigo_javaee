<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
 
 <%@ page import="com.lineadecodigo.javaee.commons.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mi Primer JSP</title>
</head>
<body>
<h1>Mi Primer JSP</h1>

<% out.println("Esta es mi primera página JSP<br>"); %>
<%="Esta es mi primera página JSP" %>
<% out.println(WebInfo.pageURL(getServletContext(), "mi-primera-pagina-jsp"));	 %>

</body>
</html>