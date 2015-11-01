package com.lineadecodigo.javaee.rest;


/**
 * @file ParametroQueryRest.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   1/nov/2015
 * @url    http://lineadecodigo.com/java/lista-de-parametros-en-servicio-restful-jax-rs/
 * @description Servicio RESTful con JAX-RS que reciba una lista de parámetros
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

@Path("/lista")
public class ListaParametroQueryRest {
		
	public ListaParametroQueryRest() { 
		
	}
	
	@GET
    @Produces("text/html")
    public String getItems(@QueryParam("item") List<String> items) {
        
		StringBuffer sb = new StringBuffer();
		sb.append("<html lang=\"en\"><body><h1>Lista de Items</h1><p>Los items adquiridos son:</p><ul>");
		
		for (String item:items)
			sb.append("<li>").append(item).append("</li>");

		sb.append("</ul></body></html>");
		
		return sb.toString();
        

    }

}

