package com.onlineroom.roombooking;

import java.util.Scanner;

import com.onlineroom.imp.HotelName;
import com.onlineroom.imp.Logger;




public class Hotel {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		HotelName c=new HotelName();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter HotelId=");
		c.setHotelId(s.nextInt());
		
		LOGGER.debug("Enter HotelName=");
		c.setHotelName(s.next());
		
		LOGGER.debug("Enter Location=");
		c.setLocation(s.next());
		
		LOGGER.debug("Enter Rating=");
		c.setRating(s.nextInt());
		
		LOGGER.debug("Enter Status=");
		c.setStatus(s.next());
		
		LOGGER.debug("Enter Roomtype=");
		c.setRoomType(s.nextLine());
		

		c.hotel(c);
		
	}

}