package com.onlineroom.adminlogin;

import java.util.Scanner;

import com.onlineroom.imp.AdminLogin;
import com.onlineroom.imp.Logger;

public class Admin {
	private static Logger LOGGER = Logger.getInstance();
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug(" Enter UserName:");
		String userName=s.nextLine();
		
		LOGGER.debug("Enter Password:");
		String passWord=s.nextLine();
		AdminLogin c=new AdminLogin();
		c.AdminLogin(userName,passWord);
	}
	

}
