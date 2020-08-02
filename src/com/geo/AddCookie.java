package com.geo;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookie extends HttpServlet {
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("cookie1"));
		int j = Integer.parseInt(req.getParameter("cookie2"));
		int lempar = i+j;
		Cookie cookie = new Cookie("k",lempar+"");
		res.addCookie(cookie);
		res.sendRedirect("cookie2");
	}

}
