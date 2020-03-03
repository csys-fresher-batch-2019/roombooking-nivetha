package com.nive.hotelroom.customerdetails;

import java.util.Scanner;

import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;

public class TestAdd  {
	private static Logger LOGGER = Logger.getInstance();
	public static void main(String[] args) throws Exception {
		CustomerDetails c=new CustomerDetails();
		@SuppressWarnings("resource")
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
		CustomerDAO p=DAOFactory.getCustomerDAO();
		p.insertcustomerdetalis(c);

	}

}
