package com.rohan;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String a = req.getParameter("n1");
		String b = req.getParameter("n2");
		String c =req.getParameter("n3");
		String d=req.getParameter("n4");
		String e=req.getParameter("n5");
		
		Cookie cookie = new Cookie("email", c + "");
		Cookie cookie1 = new Cookie("pass", e + "");
		
		res.addCookie(cookie);
		res.addCookie(cookie1);
		
		PrintWriter p = res.getWriter();
		p.println("You have Succesfully Registred ");
		
      		
		
}}
