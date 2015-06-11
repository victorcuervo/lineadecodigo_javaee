package com.lineadecodigo.javaee.servlet;

/**
 * @file MiPrimerServlet.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   27/diciembre/2007
 * @url    http://lineadecodigo.com/java/mi-primer-servlet/
 * @description Como construir y desplegar tu primer servlet  
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lineadecodigo.javaee.commons.WebInfo;


public class MiPrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MiPrimerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		out = response.getWriter();

		response.setContentType("text/html");
	
		out.println("<html>");
		out.println("<head><title>Mi Primer Servlet </title></head>");
		out.println("<body>");
		out.println("<h1>Este es mi Primer Servlet</h1>");			
		out.println(WebInfo.pageURL(getServletContext(), "mi-primer-servlet"));			
		out.println("</body></html>");  
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
