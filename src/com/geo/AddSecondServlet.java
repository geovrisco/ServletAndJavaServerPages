package com.geo;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddSecondServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		System.out.println("ini di session2");
		int session2 = (int) session.getAttribute("result");
		int session3 = session2 +10;
		res.getWriter().println("hasil adalah "+session2+" ditambah 10"+session3);
	}
}