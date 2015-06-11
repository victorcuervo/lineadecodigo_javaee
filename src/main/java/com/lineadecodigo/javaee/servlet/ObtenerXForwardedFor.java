package com.lineadecodigo.javaee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lineadecodigo.javaee.commons.WebInfo;

/**
 * Servlet implementation class ObtenerXForwardedFor
 */
public class ObtenerXForwardedFor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ObtenerXForwardedFor() {
		super();
	}   	
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		PrintWriter out = response.getWriter();
		 
		out.println("<html><head><title>Obtener X-FORWARDED-FOR</title></head><body>");
		out.println("<h1>Obtener X-FORWARDED-FOR</h1>");
		    		    
		String sIP = request.getHeader("X-FORWARDED-FOR");
		out.print("La IP origen ha llegado por: " + sIP);
		 
		out.println(WebInfo.pageURL(getServletContext(), "x-forwarded-for"));
		out.println("</body></html>");
  
	}  	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	} 

}

