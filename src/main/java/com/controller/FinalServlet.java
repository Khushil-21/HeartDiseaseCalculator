package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Validators;

public class FinalServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String gender = request.getParameter("gender");
		request.setAttribute("GenderValue", gender);
		
		Integer age = Integer.parseInt(request.getParameter("age"));
		String bp = request.getParameter("bp");

		if (Validators.isEmpty(bp) == true) {
			request.setAttribute("Bp", "False");
			bp = "False";
		} else {
			request.setAttribute("Bp", bp);
		}

		String diabetes = request.getParameter("dia");

		if (Validators.isEmpty(diabetes) == true) {
			request.setAttribute("dia", "False");
			diabetes = "False";
		} else {
			request.setAttribute("dia", diabetes);
		}

		String smoke = request.getParameter("smoke");

		if (Validators.isEmpty(smoke) == true) {
			request.setAttribute("Smoke", "False");
			smoke = "False";
		} else {
			request.setAttribute("Smoke", smoke);
		}

		
		
		if (age < 18) {
			request.setAttribute("Percentage", "<br> Chance Less Than 5%");
		} else if (age <= 60) {
			if (gender.equals("male") && smoke.equals("True")) {

				request.setAttribute("Percentage", "50%");
			} else {
				request.setAttribute("Percentage", "25%");
			}
		} else if (age > 60) {
			if (diabetes.equals("True")) {
				if (bp.equals("True")) {
					request.setAttribute("Percentage", "75%");
				} else {
					request.setAttribute("Percentage", "50%");
				}
			} else {
				if (bp.equals("True")) {
					request.setAttribute("Percentage", "65%");
				} else {

					request.setAttribute("Percentage", "30%");

				}

			}
		}

		RequestDispatcher rd = request.getRequestDispatcher("FinalSuccess.jsp");
		rd.forward(request, response);

	}

}
