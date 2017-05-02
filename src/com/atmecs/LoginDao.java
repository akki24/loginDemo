package com.atmecs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	public static boolean validateUser(String name,String pass) throws Exception{

		Class.forName("com.mysql.jdbc.Driver");
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay", "root", "rajendra#123");
	
	PreparedStatement ps=con.prepareStatement(  
			"select * from Login where Username=? and Password=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
			      
			ResultSet rs=ps.executeQuery();  
			
		
		return rs.next();
		
	}
}
