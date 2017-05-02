package com.atmecs;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/Welcome")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
	
		String name=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		try {
			Boolean status=LoginDao.validateUser(name, pass);
			if(status==true){
				pw.print("welcome Mr/Mrs. "+name);
			}
			else{
				
				pw.print("incorrect userid or password");
				
			}
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	
}
