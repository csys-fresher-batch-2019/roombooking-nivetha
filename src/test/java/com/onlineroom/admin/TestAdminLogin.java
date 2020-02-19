package com.onlineroom.admin;
import java.util.Scanner;
import com.onlineroom.imp.AdminLogin;
import com.onlineroom.imp.Logger;

public class TestAdminLogin {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter AdminName:");
		String adminName=s.nextLine();
		LOGGER.debug("Enter Password:");
		String password=s.nextLine();
		AdminLogin c=new AdminLogin();
		c.login(adminName,password);
		

	}

	
}
