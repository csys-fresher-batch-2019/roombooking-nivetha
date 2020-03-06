package com.nive.hotelroom.hotelname;
import java.util.Scanner;

import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;
public class Hotel {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws DBException {
		HotelName c=new HotelName();
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter HotelId=");
		c.setHotelId(s.nextInt());
		s.nextLine();
		LOGGER.debug("Enter HotelName=");
		c.setHotelName(s.nextLine());
		s.nextLine();
		LOGGER.debug("Enter Location=");
		c.setLocation(s.next());
		s.nextLine();
		LOGGER.debug("Enter Rating=");
		c.setRating(s.nextInt());
		s.nextLine();
		LOGGER.debug("Enter Status=");
		c.setStatus(s.nextLine());
		s.nextLine();
		LOGGER.debug("Enter Roomtype=");
		c.setRoomType(s.nextLine());
		s.nextLine();
		LOGGER.debug("Enter Pic=");
		c.setPic(s.nextLine());
		HotelDAO p=DAOFactory.getHotelDAO();
		p.hotel(c);
		
	}

}