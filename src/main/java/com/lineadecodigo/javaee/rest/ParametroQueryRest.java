package com.lineadecodigo.javaee.rest;

/**
 * @file ParametroQueryRest.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25/oct/2015
 * @url    http://lineadecodigo.com/java/servicio-restful-en-jax-rs-con-parametros-query/
 * @description Uso de parámetros query en las URI de un RESTful con JAX-RS 
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path("/saludo")
public class ParametroQueryRest {
		
	public ParametroQueryRest() {
    }
	
	@GET
    @Produces("text/html")
    public String getSaludo(@QueryParam("nombre") String nombre) {
        return "<html lang=\"en\"><body><h1>Hola " + nombre + "</h1></body></html>";
    }

}

