package com.bridgelabz.packageprgram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PackageProgram extends HttpServlet{
	private String message;
	public void init(){
		message="Hello Pooja";
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	    out.println("<h1>" + message + "</h1>");
	}
	public void destroy() {
	     
	}
}
