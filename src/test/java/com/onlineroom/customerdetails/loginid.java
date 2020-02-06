package com.onlineroom.customerdetails;

import java.util.Scanner;

import com.onlineroom.imp.Customer;
import com.onlineroom.imp.Logger;


public class loginid {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("EmailId:");
		String emailId=s.nextLine();
		LOGGER.debug("Enter Password:");
		String password=s.nextLine();
		Customer c=new Customer();
		c.loginid(emailId,password);
	}

}
