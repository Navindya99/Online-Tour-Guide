package com.admin;

import jakarta.servlet.RequestDispatcher;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.admin.adminDBUtil;

public class adminLoginServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		boolean isTrue;
		isTrue = adminDBUtil.validate(username, password);
		
		if (isTrue == true) {
			response.sendRedirect("admin/success.jsp");
		} 
		else{
			response.sendRedirect("admin/index.jsp");
		}
	}

}
