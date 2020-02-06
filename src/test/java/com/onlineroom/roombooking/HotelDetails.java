package com.onlineroom.roombooking;

import java.util.Scanner;

import com.onlineroom.imp.HotelName;
import com.onlineroom.imp.Logger;


public class HotelDetails {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter HotelName:");
		String hotelName=s.nextLine();
		HotelName c=new HotelName();
		c.getHotelDetails(hotelName);
	}

}
