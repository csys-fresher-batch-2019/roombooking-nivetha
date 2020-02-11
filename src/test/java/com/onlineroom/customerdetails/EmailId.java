package com.onlineroom.customerdetails;

import java.util.List;
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
		List<Customer> list = p. getUserDetailsByEmail(emailId);
		for (Customer email  : list) 
		{
			System.out.println(email.toString1());
		}
		
		
	}

}
