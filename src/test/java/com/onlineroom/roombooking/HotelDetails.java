package com.onlineroom.roombooking;

import java.util.List;
import java.util.Scanner;

import com.onlineroom.imp.HotelName;
import com.onlineroom.imp.Logger;


public class HotelDetails {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		@SuppressWarnings({ "resource", "unused" })
		Scanner s=new Scanner(System.in);
		HotelName c=new HotelName();
		List<HotelName> list =c.getHotelDetails();
		for (HotelName name : list) 
		{
			System.out.println(name.toString());
		}
		
	}

}
