package com.nive.hotelroom.customerdetails;

import java.util.Scanner;

import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;

public class ChangePassword {
	private static Logger LOGGER = Logger.getInstance();
	public static void main(String[] args) throws DBException {
		CustomerDetails al=new CustomerDetails();
		Scanner s=new Scanner(System.in);
		LOGGER.debug("EmailId:");
		al.setEmailId(s.nextLine());
		LOGGER.debug("Password:");
		al.setPassword(s.nextLine());
		LOGGER.debug("New password:");
		al.setPassword(s.nextLine());
		CustomerDAO p=DAOFactory.getCustomerDAO();
		p.changePassword(al);

	}

}
