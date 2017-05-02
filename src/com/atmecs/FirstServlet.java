package com.atmecs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/Login")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		pw.print("<html><body>");
		pw.print("<form action='Welcome'>");
		pw.print("<h3>User Name:<input type='text' name='uname'></h3>");
		pw.print("<h3>Password:<input type='password' name='pass'></h3>");
		pw.print("<input type='submit' value='login'/> ");
		pw.print("</form>");
		//pw.print("<a href=Welcome>Login</a>");
		pw.print("</html></body>");
	
	}

}
