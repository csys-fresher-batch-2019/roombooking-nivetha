package com.nive.hotelroom.admin;
import java.util.Scanner;

import com.nive.hotelroom.dao.AdminDAO;
import com.nive.hotelroom.domain.AdminLogin;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;

public class TestAdminLogin {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws DBException {
		AdminLogin al=new AdminLogin();
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter AdminName:");
		al.setAdminName(s.nextLine());
		LOGGER.debug("Enter Password:");
		al.setPassword(s.nextLine());
		AdminDAO c=DAOFactory.getAdminDAO();
		c.login(al);
		

	}

	
}
