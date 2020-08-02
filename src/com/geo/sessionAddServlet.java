package com.geo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
public class sessionAddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int session1 = Integer.parseInt(req.getParameter("ses1"));
		int session2 = Integer.parseInt(req.getParameter("ses2"));
		System.out.println(" ini di session 1");
		int result = session1*session2;
		HttpSession session = req.getSession();
		
		session.setAttribute("result", result);
		res.sendRedirect("session2");
	}
}
