package com.lineadecodigo.javaee.rest;

/**
 * @file HolaMundoRest.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25/oct/2015
 * @url    http://lineadecodigo.com/java/hola-mundo-con-jax-rs/
 * @description Ejemplo para crear un servicio RESTful mediante JAX-RS  
 */


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("holamundo")
public class HolaMundoRest {
	
	public HolaMundoRest() {
    }
	
	@GET
    @Produces("text/html")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Hola Mundo!!</h1></body></html>";
    }

}
