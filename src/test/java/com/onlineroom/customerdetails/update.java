package com.onlineroom.customerdetails;

import java.util.Scanner;

import com.onlineroom.imp.Customer;
import com.onlineroom.imp.Logger;


public class update {
	private static Logger LOGGER = Logger.getInstance();


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LOGGER.debug("UserId:");
		int userId=s.nextInt();
		Customer p=new Customer();
		p. update(userId);
		
	}

}
