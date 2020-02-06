package com.onlineroom.customerdetails;

import java.util.Scanner;

import com.onlineroom.imp.Customer;
import com.onlineroom.imp.Logger;



public class EmailId {
	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		Customer p=new Customer();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("EmailId:");
		String emailId=s.nextLine();
		
		p. getUserDetailsByEmail(emailId);
		
	}

}
