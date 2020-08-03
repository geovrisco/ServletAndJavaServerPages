package com.login;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String sql = "select * from login where userName =? and password=?";
	String url = "jdbc:postgresql://localhost:5432/mario";
	String dbUserName ="postgres";
	String dbPassword = "postgres";
	
	public boolean check(String uname, String pass) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,dbUserName,dbPassword);
			PreparedStatement st = con.prepareStatement(sql);
//			st.setNString(1, uname);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				return true;
			}
					
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		return false;
	}
}
