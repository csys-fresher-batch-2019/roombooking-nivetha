package com.nive.hotelroom.customerdetails;

import java.util.List;
import java.util.Scanner;
import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;

public class EmailId {
	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws DBException {
		CustomerDetails al=new CustomerDetails();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("EmailId:");
		al.setEmailId(s.nextLine());
		CustomerDAO p=DAOFactory.getCustomerDAO();
		List<CustomerDetails> list = p. getUserDetailsByEmail(al);
		for (CustomerDetails email  : list) 
		{
			System.out.println(email.toString1());
		}
		
		
	}

}
