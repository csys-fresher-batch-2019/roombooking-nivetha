package com.nive.hotelroom.admin;
import java.util.Scanner;

import com.nive.hotelroom.dao.AdminDAO;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;

public class TestAdminLogin {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter AdminName:");
		String adminName=s.nextLine();
		LOGGER.debug("Enter Password:");
		String password=s.nextLine();
		AdminDAO c=DAOFactory.getAdminDAO();
		c.login(adminName,password);
		

	}

	
}
