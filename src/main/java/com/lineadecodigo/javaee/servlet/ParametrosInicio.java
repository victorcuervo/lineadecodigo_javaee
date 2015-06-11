package com.lineadecodigo.javaee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lineadecodigo.javaee.commons.WebInfo;


public class ParametrosInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String _nivelLog;
	private int _numeroPeticiones;

	public ParametrosInicio() {
        super();    
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		out = response.getWriter();

		response.setContentType("text/html");
	
		out.println("<html>");
		out.println("<head><title>Valor parametros inicialización</title></head>");
		out.println("<body>");
		out.println("<h1>Valor parametros inicialización</h1>");
		out.println("Nivel Log: " + _nivelLog + "<br/>");
		out.println("Numero Peticiones: " + _numeroPeticiones);
		out.println(WebInfo.pageURL(getServletContext(), "leer-parametros-de-inicializacion-de-un-servlet"));	
		out.println("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
	
	public void init(ServletConfig config){
		try{
			_nivelLog = config.getInitParameter("NivelLog");	
			_numeroPeticiones = Integer.parseInt(config.getInitParameter("NumeroPeticiones"));
		} catch(NullPointerException npe){
			npe.printStackTrace();
		}
	}

}
