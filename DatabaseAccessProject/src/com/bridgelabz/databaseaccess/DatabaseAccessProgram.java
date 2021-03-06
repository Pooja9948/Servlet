package com.bridgelabz.databaseaccess;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseAccessProgram extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Statement stmt=null;
		Connection con=null;
		ResultSet rs=null;	
		resp.setContentType("text/html");
		String s ="aaaa";
		PrintWriter out = resp.getWriter();
		out.print(s);
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
	        stmt = con.createStatement();
	        String sql;
	        sql = "SELECT * FROM bridgelabz.student";
	        rs = stmt.executeQuery(sql);
	        while(rs.next()){
	        	out.print(s);
	            int id  = rs.getInt("id");
	            String name = rs.getString("name");
	            String branch = rs.getString("branch");
	            
	            out.println("ID: " + id + "<br>");
	            out.println(", Name: " + name + "<br>");
	            out.println(", Branch: " + branch + "<br>");
	            
	         }
	        out.println("</body></html>");
	        rs.close();
	        stmt.close();
	        con.close();
	    }catch(SQLException se) {
	         se.printStackTrace();
	      } catch(Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(stmt!=null)
	               stmt.close();
	         } catch(SQLException se2) {
	         }
	         try {
	            if(con!=null)
	            con.close();
	         } catch(SQLException se) {
	            se.printStackTrace();
	         }
	      }
	}
}
