package com.onlineroom.roombooking;

import java.util.Scanner;

import com.onlineroom.imp.HotelName;
import com.onlineroom.imp.Logger;


public class Rating {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter Rating:");
		float rating=s.nextFloat();
		HotelName c=new HotelName();
		c.getHotelByRating(rating);
	}

}
