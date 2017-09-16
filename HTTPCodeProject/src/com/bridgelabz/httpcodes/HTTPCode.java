package com.bridgelabz.httpcodes;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HTTPCode extends HttpServlet{
	private String message;
	public void init() throws ServletException {
	      // Do required initialization
	      message = "Hello World";
	   }
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
			  	response.setContentType("text/html");
		      // Set error code and reason.
		      response.sendError(407, "Need authentication!!!" );
		      PrintWriter out = response.getWriter();
		      out.println("<h1>" + message + "</h1>");
		   }
		   
	public void destroy() {
	      // do nothing.
	   }
}
