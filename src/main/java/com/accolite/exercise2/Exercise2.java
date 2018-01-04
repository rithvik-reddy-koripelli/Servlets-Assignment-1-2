package com.accolite.exercise2;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exercise2 extends HttpServlet {


	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter pw = resp.getWriter();
		
		pw.write("Name: "+req.getParameter("name") +"<br/>");
		pw.write("EMAIL: "+req.getParameter("email") );
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		
		pw.write("Name: "+req.getParameter("name") +"<br/>");
		pw.write("EMAIL: "+req.getParameter("email") );
		
	}
}
