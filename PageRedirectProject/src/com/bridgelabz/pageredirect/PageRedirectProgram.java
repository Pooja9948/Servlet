package com.bridgelabz.pageredirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageRedirectProgram extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {

		      // Set response content type
		      response.setContentType("text/html");

		      // New location to be redirected
		      String site = new String("http://www.google.com");

		      response.setStatus(response.SC_MOVED_TEMPORARILY);
		      response.setHeader("Location", site);    
		   }
}
