package com.onlineroom.customerdetails;

import java.util.Scanner;

import com.onlineroom.imp.Customer;
import com.onlineroom.imp.Logger;


public class InsertCustomerDetails {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		Customer c=new Customer();
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter Userid=");
		c.setUserId(s.nextInt());
		
		LOGGER.debug("Enter UserName=");
		c.setUserName(s.next());
		
		LOGGER.debug("Enter MobNum=");
		c.setMobNo(s.next());
		
		LOGGER.debug("Enter City=");
		c.setCity(s.next());
		
		LOGGER.debug("Enter EmailId=");
		c.setEmailId(s.next());
		
		LOGGER.debug("Enter Password=");
		c.setPassword(s.next());
		
		c.insertcustomerdetalis(c);

	}

}
