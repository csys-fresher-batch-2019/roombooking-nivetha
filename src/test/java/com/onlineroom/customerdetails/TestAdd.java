package com.onlineroom.customerdetails;

import java.util.Scanner;
import org.jdbi.v3.core.Jdbi;
import com.onlineroom.dao.CustomerInterfaceDAO;
import com.onlineroom.imp.Customer;
import com.onlineroom.imp.Logger;
import com.onlineroom.util.ConnectionUtil;

public class TestAdd  {
	private static Logger LOGGER = Logger.getInstance();

	
	//jdbi.onDemand(CustomerInterfaceDAO.class);
	public static void main(String[] args) throws Exception {
	     @SuppressWarnings("unused")
		Jdbi jdbi=ConnectionUtil.getJdbi();
		 @SuppressWarnings("unused")
		CustomerInterfaceDAO nn=new Customer();
		Customer c=new Customer();
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
		
		c.insertcustomerdetalis(c);

	}

}
