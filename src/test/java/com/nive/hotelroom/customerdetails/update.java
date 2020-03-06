package com.nive.hotelroom.customerdetails;

import java.util.Scanner;

import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;


public class update {
	
	private static Logger LOGGER = Logger.getInstance();


	public static void main(String[] args) throws DBException {
		Scanner s=new Scanner(System.in);
		CustomerDetails al=new CustomerDetails();
		LOGGER.debug("UserId:");
		al.setUserId(s.nextInt());
		CustomerDAO p=DAOFactory.getCustomerDAO();
		p. update(al);
		
	}

}
