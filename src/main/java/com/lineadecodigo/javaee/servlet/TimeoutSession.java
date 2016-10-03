package com.lineadecodigo.javaee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TimeoutSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TimeoutSession() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Establecemos el tiempo de sesión
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(20*60);		
		
	}

}
