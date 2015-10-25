package com.lineadecodigo.javaee.servlet;

/**
 * @file MappingAnotaciones.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   25/oct/2015
 * @url    http://lineadecodigo.com/java/parametros-inicio-servlet-con-anotaciones/
 * @description Servlet que realiza el Mapping con Anotaciones para los parámetros de inciio  
 */

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (value="/AnotacionesParametros", initParams = @WebInitParam (name="p1",value="victor"))
public class MappingParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String valor;
	
    public MappingParametros() {
        super();
    }
    
    public void init (ServletConfig config) {
    	valor = config.getInitParameter("p1");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Servlet de Prueba de Mapping para parámetros. Valor del parámetro 1: ").append(valor);
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
