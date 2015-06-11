package com.lineadecodigo.javaee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lineadecodigo.javaee.commons.WebInfo;


public class RecibirParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public RecibirParametros() {
		super();
	}   	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}  	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out;
		out = response.getWriter();
		   
		response.setContentType("text/html");
		  
		out.println("<html>");
		out.println("<head><title>Enviar parametros a un Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Enviar parametros a un Servlet</h1>");
		
		
		//Capturamos los par·metros
		String parametro1 = request.getParameter("p1");
		String parametro2 = request.getParameter("p2");
		
		if ((parametro1 != null) || (parametro2 !=null)) {
		   
			out.println("La primera palabra pasada como par&aacute;metro es <strong>" + parametro1 + "</strong><br>");
			out.println("La segunda palabra pasada como par&aacute;metro es <strong>" + parametro2 + "</strong><br>");
			out.println("<br/><br/><a href='RecibirParametros'>&lt; &lt; Vuelve a introducir nuevos par√°metros</a>");
			
		} else {
			
			out.println("<form method='get' action='RecibirParametros'>");
			out.println("<label for='p1'>Par·metro 1:</label> <input type='text' name='p1' id='p1' size='20'/><br/>");
			out.println("<label for='p2'>Par·metro 2:</label> <input type='text' name='p2' id='p2' size='20'/><br/>");
			out.println("<input type='submit' value='Enviar Par·metros'/>");
			out.println("</form>");			
			
		}
		
		out.println(WebInfo.pageURL(getServletContext(), "recibir-parametros-de-un-servlet"));	
		out.println("</body></html>");
				
	}  

}
