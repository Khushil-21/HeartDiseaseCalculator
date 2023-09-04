package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.util.Validators;

public class FinalFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String gender = request.getParameter("gender");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		boolean isError = false;

		if (Validators.isEmpty(name) == true) {
			isError=true;
			request.setAttribute("NameError","Please Enter Name");
		}
		else {
			request.setAttribute("NameValue",name);
		}

		if (Validators.isEmpty(age) == true) {
			isError=true;
			request.setAttribute("AgeError","Please Enter Age");

		}
		else {
			request.setAttribute("AgeValue",age);
		}

		if (Validators.isEmpty(gender) == true) {
			isError=true;
			request.setAttribute("GenderError","Please Select Gender");
		}
		
		if(isError==true) {
			RequestDispatcher rd = request.getRequestDispatcher("FinalSignup.jsp");
			rd.forward(request, response);
		}
		else {
			chain.doFilter(request, response);
		}

	}

	public void destroy() {

	}

}
