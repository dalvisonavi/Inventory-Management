package com.inventory.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.form.UserForm;
import com.inventory.impl.LoginServiceImpl;
import com.inventory.service.LoginService;

/**
 * 
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String un=request.getParameter("username"); //take input username from http Request
		String pw=request.getParameter("password"); //take input password from http Request
		
		UserForm userForm = new UserForm(un, pw); //instantiate userform with input parameters
		/*userForm.setUserName(un);
		userForm.setPassword(pw);	*/	
		
		LoginService loginService = new LoginServiceImpl();	
		boolean status = loginService.authenticateUser(userForm);
		
		if(status == true) {
			response.sendRedirect("success.html");
		}else {
			
			response.sendRedirect("error.html");
		}
		
		
	}

}
