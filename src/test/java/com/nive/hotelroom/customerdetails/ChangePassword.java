package com.nive.hotelroom.customerdetails;

import java.util.Scanner;

import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;

public class ChangePassword {
	private static Logger LOGGER = Logger.getInstance();


	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("EmailId:");
		String emailId=s.nextLine();
		LOGGER.debug("Password:");
		String password=s.nextLine();
		LOGGER.debug("New password:");
		String pass=s.nextLine();
		
		CustomerDAO p=DAOFactory.getCustomerDAO();
		p.changePassword(emailId,password,pass);

	}

}
