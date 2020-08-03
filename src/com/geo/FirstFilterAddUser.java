package com.geo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FirstFilterAddUser
 */
@WebFilter("/AddUser")
public class FirstFilterAddUser implements Filter {

    /**
     * Default constructor. 
     */
    public FirstFilterAddUser() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		PrintWriter out = response.getWriter();
		System.out.println("ini di first servlet");
		//convert servlet request 
		HttpServletRequest req = (HttpServletRequest) request;
		int userId = Integer.parseInt(request.getParameter("userId"));
		if (userId<0) {
			out.print("invalid ID, id = "+ userId);
		} else {
			chain.doFilter(request, response);
			
		}
		// pass the request along the filter chain
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
