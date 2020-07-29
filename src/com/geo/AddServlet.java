package com.geo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{ 
	//untuk menggunakan method dalam servlet kita HARUS menggunakan method name service
 
//	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
//		/*
//		 * Service akan menerima 2 parameter yaitu request dan response
//		 * */
//		int num1 = Integer.parseInt(req.getParameter("num1"));
//		int num2 = Integer.parseInt(req.getParameter("num2"));
//		int result = num1 + num2;
//		
//		System.out.println("result is "+ result);
//		PrintWriter out = res.getWriter();
//		out.println("result is" + result);
//	}
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		/*
		 * doPost akan handle request ONLY POSTs request
		 * */
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int result = num1 + num2;
		
		System.out.println("result is "+ result);
		PrintWriter out = res.getWriter();
		out.println("result is " + result);
	}
	
	
}
