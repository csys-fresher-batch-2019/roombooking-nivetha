package com.onlineroom.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.onlineroom.util.ConnectionUtil;

public class AdminLogin {
	private static Logger LOGGER = Logger.getInstance();
	private String adminName;
	private String passWord;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword(String password) {
		this.passWord = password;
	}

	public void login(String adminName, String passWord) {
		String sql = "select adminname,password from login where adminname='" + adminName + "' and password='"+ passWord + "'";
		try (Connection con = ConnectionUtil.getConnect();Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql))
		{
			LOGGER.debug(sql);
			if (rs.next()) {
				String adminName1 = rs.getString("adminname");
				//LOGGER.debug(adminName1);
				String Password = rs.getString("password");
				//LOGGER.debug(Password);
				if (adminName.equals(adminName1) && passWord.equals(Password)) 
				{

					LOGGER.debug("Login Successfull");
				} 
				
			}
			else 
			{
				LOGGER.debug("Login failed");
			}
		} 
		catch (Exception e) 
		{
			LOGGER.debug(e);
		}
	}
}
