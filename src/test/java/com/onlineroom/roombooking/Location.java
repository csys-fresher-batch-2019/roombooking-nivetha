package com.onlineroom.roombooking;

import java.util.List;
import java.util.Scanner;

import com.onlineroom.imp.HotelName;
import com.onlineroom.imp.Logger;


public class Location {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter location:");
		String location=s.nextLine();
		HotelName c=new HotelName();
		List<HotelName> list =	c.getHotelByLocation(location);
		for (HotelName name : list) 
		{
			System.out.println(name.toString3());
		}
	
	}

}
