package com.nive.hotelroom.customerdetails;

import java.util.Scanner;

import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;


public class update {
	
	private static Logger LOGGER = Logger.getInstance();


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("UserId:");
		int userId=s.nextInt();
		CustomerDAO p=DAOFactory.getCustomerDAO();
		p. update(userId);
		
	}

}
