package com.lineadecodigo.javaee.servlet;

/**
 * @file ServletForward.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   10/abril/2020
 * @url    http://lineadecodigo.com/java/reenviar-peticion-a-otro-servlet/
 * @description Servlet que implementa un patrón Controller y encamina la petición a otro servlet. 
 */


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletForward() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.getRequestDispatcher("MiPrimerServlet") .forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
