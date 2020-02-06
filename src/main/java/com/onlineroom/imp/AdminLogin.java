package com.onlineroom.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.onlineroom.util.ConnectionUtil;

public class AdminLogin {
	private static Logger LOGGER = Logger.getInstance();
	    private String userName;
        private String passWord;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassWord() {
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		@Override
		public String toString() {
			return "AdminLogin [userName=" + userName + ", passWord=" + passWord + "]";
		}
		
		public void AdminLogin(String userName,String passWord) 
		{			
			String sql = "select username,password from login ";
			try (Connection con = ConnectionUtil.getConnect();Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
				LOGGER.debug(sql);
				if (rs.next()) {
					String username= rs.getString("userName");
					// LOGGER.debug(EmailId);
					String Password = rs.getString("passWord");
					// LOGGER.debug(Password);
					if (userName.equals(username) && passWord.equals(Password)) {

						LOGGER.debug("Login Successfull");
					} else {
						LOGGER.debug("Login failed");
					}
				}
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
	

}
