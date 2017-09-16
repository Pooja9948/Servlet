package com.bridgelabz.clientrequest;

import java.io.*;

import javax.servlet.*;

public class ClientRequest extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException

	   {
		PrintWriter out = res.getWriter();
		
		res.setContentType("text/html");

	      String login= req.getParameter("loginid");

	      String password= req.getParameter("password");

	      out.print("You have successfully login :");

	      out.println("Your login ID is: "+login);

	      out.println("Your password is: " +password);

	      out.close();
	   }
	
}
