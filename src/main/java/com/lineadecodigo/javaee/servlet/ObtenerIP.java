package com.lineadecodigo.javaee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lineadecodigo.javaee.commons.WebInfo;


public class ObtenerIP extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private static final long serialVersionUID = 1L;


	public ObtenerIP() {
		super();
	}   	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String ip = null; // IP del cliente
	    String host = null; // Host del cliente
	   
	    ip = request.getRemoteAddr();
	    host = request.getRemoteHost();
	   
	    PrintWriter out = response.getWriter();
	    response.setContentType("text/html");
	   
	    out.println("<html><head><title>Obtener IP del cliente</title></head><body>");
	    out.println("<h1>Obtener la IP del cliente</h1>");
	    out.println("La ip del cliente es " + ip + "<br>");
	    out.println("El host del cliente es " + host);	    		
	    out.println(WebInfo.pageURL(getServletContext(), "obtener-ip"));	    	    
	    out.println("</body></html>");
	    
	    
	}  	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}   	  	    
}