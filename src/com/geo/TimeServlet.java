package com.geo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
		int k = (int) req.getAttribute("result");
		int times = k * k;
		
		PrintWriter out = res.getWriter();
		
		out.println("perkalian : "+times);
	}
}
