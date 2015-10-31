package com.lineadecodigo.javaee.rest;

/**
 * @file ParametroRest.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25/oct/2015
 * @url    http://lineadecodigo.com/java/parametros-restful-con-jax-rs/
 * @description Uso de parámetros en las URI de un RESTful con JAX-RS 
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("saludo/{nombre}")
public class ParametroRest {
		
	public ParametroRest() {
    }
	
	@GET
    @Produces("text/html")
    public String getSaludo(@PathParam("nombre") String nombre) {
        return "<html lang=\"en\"><body><h1>Hola " + nombre + "</h1></body></html>";
    }

}
