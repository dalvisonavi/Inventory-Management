package com.inventory.dao;

import java.sql.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.inventory.form.UserForm;


public class LoginDAO 
{
	private static Connection c = null;
	private Connection getDatabasConnection() {
		try 
		{	
			if(c==null) {
				Class.forName("com.mysql.jdbc.Driver");
				 // loads driver
				c = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "root"); // gets a new connection
			}
			return c;
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String retrieveUserDetails(String un) throws SQLException {
		
		Connection con = getDatabasConnection();
		PreparedStatement ps = con.prepareStatement("select pwd from user_master where user_name=?");
		try {
			ps.setString(1, un);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) 
			{
				return rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

		
		
	}
	
	
}
