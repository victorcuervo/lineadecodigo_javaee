package com.lineadecodigo.javaee.servlet;

/**
 * @file MappingAnotaciones.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25/oct/2015
 * @url    http://lineadecodigo.com/java/servlet-mapping-con-anotaciones/
 * @description Servlet que realiza el Mapping con Anotaciones  
 */


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet ("/Anotaciones")
public class MappingAnotaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MappingAnotaciones() {
        super();
    }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Servlet de Prueba de Mapping por anotaciones");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
