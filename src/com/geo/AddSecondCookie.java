package com.geo;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddSecondCookie extends HttpServlet {
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("k")) {
				int k = Integer.parseInt(c.getValue());
			}
		}
	}

}