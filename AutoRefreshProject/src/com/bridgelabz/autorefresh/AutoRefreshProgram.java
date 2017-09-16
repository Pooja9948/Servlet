package com.bridgelabz.autorefresh;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AutoRefreshProgram extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		response.setIntHeader("Refresh", 5);
	    response.setContentType("text/html");
	    Calendar calendar = new GregorianCalendar();
	      String am_pm;
	      int hour = calendar.get(Calendar.HOUR);
	      int minute = calendar.get(Calendar.MINUTE);
	      int second = calendar.get(Calendar.SECOND);
	      
	      if(calendar.get(Calendar.AM_PM) == 0)
	        am_pm = "AM";
	      else
	        am_pm = "PM";
	      String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
	      
	      PrintWriter out = response.getWriter();
	      String title = "Auto Page Refresh using Servlet";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      out.println(docType +
	         "<html>\n" +
	         "<head><title>" + title + "</title></head>\n"+
	         "<body bgcolor = \"#f0f0f0\">\n" +
	         "<h1 align = \"center\">" + title + "</h1>\n" +
	         "<p>Current Time is: " + CT + "</p>\n"
	      );
	}
}
