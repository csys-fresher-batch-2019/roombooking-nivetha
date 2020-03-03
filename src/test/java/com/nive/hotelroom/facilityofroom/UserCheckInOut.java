package com.nive.hotelroom.facilityofroom;

import java.util.List;
import java.util.Scanner;

import com.nive.hotelroom.dao.RoomTypeDAO;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;


public class UserCheckInOut {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter userid:");
		int userid=s.nextInt();
		RoomTypeDAO c=DAOFactory.getRoomTypeDAO();
		List<RoomType> list =c.getUserCheckInOut(userid);
		for (RoomType name : list) 
		{
			System.out.println(name.toString1());
		}
		
		
	}

}
