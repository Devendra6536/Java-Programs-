package com.login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginSystem
 */
public class LoginSystem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
    	String name = req.getParameter("username");
    	String email = req.getParameter("email");
    	String password = req.getParameter("password");
    	
    	Logindata l = new Logindata();
    	if(!l.getconn(name,email,password)) {
//    		RequestDispatcher rd = req.getRequestDispatcher("Welcome"); 
//    		rd.forward(req, res);
    		PrintWriter p1 = res.getWriter();
        	p1.println("your name : "+ name + "\n" + " your email : " + email + "\n"+" Your password" + password);
        	 
    	}
    }
}
