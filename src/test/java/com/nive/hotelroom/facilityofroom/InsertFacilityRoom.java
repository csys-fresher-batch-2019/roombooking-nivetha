package com.nive.hotelroom.facilityofroom;

import java.util.Scanner;

import com.nive.hotelroom.dao.RoomTypeDAO;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;


public class InsertFacilityRoom {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		RoomType c=new RoomType();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter UserId=");
		c.setUser(s.nextInt());
		s.nextLine();
		LOGGER.debug("Enter HotelId");
		c.setHotel(s.nextInt());
		s.nextLine();
		LOGGER.debug("Enter Members=");
		c.setMembers(s.nextInt());
		s.nextLine();
		LOGGER.debug("Enter RoomType =");
		c.setRoomType(s.nextLine());
		s.nextLine();
		LOGGER.debug("Enter BedType=");
		c.setBedType(s.nextLine());
		s.nextLine();
		LOGGER.debug("Enter CheckIn=");
		c.setCheckIn(java.sql.Date.valueOf(s.nextLine()));
		s.nextLine();
		LOGGER.debug("Enter CheckOut=");
		c.setCheckOut(java.sql.Date.valueOf(s.nextLine()));
		s.nextLine();
		RoomTypeDAO u= DAOFactory.getRoomTypeDAO();
		u.insertfacilityroom(c);
	}

}
