package com.onlineroom.customerdetails;

import java.util.Scanner;

import com.onlineroom.imp.Customer;
import com.onlineroom.imp.Logger;

public class ChangePassword {
	private static Logger LOGGER = Logger.getInstance();


	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("EmailId:");
		String emailId=s.nextLine();
		LOGGER.debug("Password:");
		String password=s.nextLine();
		LOGGER.debug("New password:");
		String pass=s.nextLine();
		
		Customer p=new Customer();
		p.changePassword(emailId,password,pass);

	}

}
