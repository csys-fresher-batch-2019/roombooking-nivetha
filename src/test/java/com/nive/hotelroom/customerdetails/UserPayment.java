package com.nive.hotelroom.customerdetails;

import java.util.List;
import java.util.Scanner;

import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;


public class UserPayment {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws DBException {
		Scanner s=new Scanner(System.in);
		CustomerDetails al=new CustomerDetails();
		LOGGER.debug("UserId:");
		al.setUserId(s.nextInt());
		CustomerDAO p=DAOFactory.getCustomerDAO();
		List<CustomerDetails> list = p. getUserDetailsByPayment(al);
		for (CustomerDetails customer  : list) 
		{
			System.out.println(customer.toString2());
		}
		
		
	}
}
