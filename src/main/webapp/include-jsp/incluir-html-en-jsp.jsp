<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.lineadecodigo.javaee.commons.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Incluir HTML en JSP</title>
</head>
<body>
<h1>Incluir HTML en JSP</h1>

En esta p&aacute;gina se incluye una parte que es un archivo HTML externo llamado "piedepagina.html"
y que nos sirve para representar el pie de la p&aacute;gina.


<jsp:include page="piedepagina.html" />

<% out.println(WebInfo.pageURL(getServletContext(), "incluir-una-parte-html-en-un-jsp"));	 %>

</body>
</html>