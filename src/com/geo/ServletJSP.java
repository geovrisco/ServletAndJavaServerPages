package com.geo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletJSP")
public class ServletJSP extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "geo";
		
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
		rd.forward(request, response);
		
				
	}
}
