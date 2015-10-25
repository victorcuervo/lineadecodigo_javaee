# Línea de Código. Ejemplos Java EE
Este repositorio contiene los códigos de ejemplo de los artículos sobre Java EE de [Línea de Código](http://lineadcodigo.com).
Entre estos ejemplos puedes encontrar explicados las tecnologías:
* Java Servlet
* JSP (Java Server Pages)
* JAX-RS

## Ejecutar Repositorio
El repositorio está montando con una structura maven, así que podrás ejecutarlo, una vez descargado con los dos siguientes comandos. 

```bash
mvn package clean
mav tomcat7:run-war
```

Una vez arrancado el servidor Tomcat deberás de ir a:

```http
http://localhost:8080/javaee/
```

Desde esa URL podrás ver todos los ejemplos.
