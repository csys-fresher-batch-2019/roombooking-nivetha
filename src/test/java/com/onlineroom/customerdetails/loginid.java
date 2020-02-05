package com.onlineroom.customerdetails;

import java.util.Scanner;

import com.onlineroom.imp.Customer;
import com.onlineroom.imp.Logger;


public class loginid {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LOGGER.debug("UserId:");
		
		int userId=s.nextInt();
		s.nextLine();
		LOGGER.debug("Enter Password:");
		String password=s.nextLine();
		Customer c=new Customer();
		c.loginid(userId,password);
	}

}
