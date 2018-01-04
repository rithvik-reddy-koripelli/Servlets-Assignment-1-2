package com.accolite.servlets;

import java.io.IOException;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MyServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget method");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		try{  
			MyConnection con = MyConnection.getConnection();
			
			
			con.stmt.execute("insert into servlet_streams_exercises values('"+name+"','"+email+"');");    
			 
		} catch(Exception e){ 
			System.out.println(e);
		}  
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Exercise2");
		requestDispatcher.forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost method");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		try{  
			MyConnection con = MyConnection.getConnection();
			
			
			System.out.println(name+email);
			con.stmt.execute("insert into servlet_streams_exercises values('"+name+"','"+email+"');");    
			 
		} catch(Exception e){ 
			System.out.println(e);
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Exercise2");
		requestDispatcher.forward(req, resp);
		
		
	}
	
	
}
	
		