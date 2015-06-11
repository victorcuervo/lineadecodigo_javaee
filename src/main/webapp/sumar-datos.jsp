<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.lineadecodigo.javaee.commons.*" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sumar datos</title>
</head>
<body>

<h1>Sumar datos</h1>

<%


String datoUno = request.getParameter("d1");
String datoDos = request.getParameter("d2");

if ((datoUno != null) || (datoDos != null)) {


	try {
		int uno = Integer.parseInt(datoUno);
		int dos = Integer.parseInt(datoDos);
		int suma = uno + dos;
	
		out.println("La suma de " + datoUno + " + " + datoDos + " = " + Integer.toString(suma));
	
	
	} catch(NumberFormatException nfe) {
		out.println("Los datos recibidos no son números enteros");
	}

} 
	
%>

<hr>

<form method="get" action="sumar-datos.jsp">
	<label for="d1">Dato 1:</label> <input type="text" id="d1" name="d1" size=4/><br/>
	<label for="d2">Dato 2:</label> <input type="text" id="d2" name="d2" size=4/><br/>
	<input type="submit" value="Sumar Datos"/>
</form>


	
<%	out.println(WebInfo.pageURL(getServletContext(), "recibir-un-parametro-numerico-en-una-jsp")); %>


</body>
</html>