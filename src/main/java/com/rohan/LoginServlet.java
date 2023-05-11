package com.rohan;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet  extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	
		String a=req.getParameter("n1");
		String b=req.getParameter("n2");
		String name="";
		String pass="";
		Cookie cookies[] = req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("email")) {
				name =c.getValue();
			}
			
			if(c.getName().equals("pass")) {
				pass=c.getValue();
			}
		}
		PrintWriter p=res.getWriter();
		if(name.equalsIgnoreCase(a) && pass.equalsIgnoreCase(b))
		{
			p.println("Logged Succesfully");
		}
		else
		{
			p.println("Incorrect Credentials");
		}
		
		
		
		
		
}}
