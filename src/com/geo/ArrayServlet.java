package com.geo;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ArrayServlet")
public class ArrayServlet extends HttpServlet{
	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Students s = new Students("geo",1);
		List<Students> studs = Arrays.asList(new Students("geo2",2),new Students("geo3",3),new Students("geo4",4) );
		request.setAttribute("students", studs);
		RequestDispatcher rd = request.getRequestDispatcher("ArrayJSP.jsp");
		rd.forward(request, response);
	}
}
