package com.lineadecodigo.javaee.commons;

import javax.servlet.ServletContext;

public class WebInfo {
	
	/* Clase que nos permite añadir información a los servlets */
	
	public static String pageURL (ServletContext context, String sURL) {	
		
		// Dado el contexto y la url de información nos muestra un enlace a la web
		// y un vuelta atrás
	    
		return "<br><br><hr>" + 
				"Art&iacute;culo disponible en: <a href='http://lineadecodigo.com/java/" + sURL + "/'>http://lineadecodigo.com/java/" + sURL + "/</a>" +
				"<br/><a href='http://lineadecodigo.com/' title='Linea de Codigo'>http://lineadecodigo.com/</a>" +
				"<br><br><a href=" + context.getContextPath() + "> &lt;&lt; Volver al Inicio</a>";
	}
	
	

}
