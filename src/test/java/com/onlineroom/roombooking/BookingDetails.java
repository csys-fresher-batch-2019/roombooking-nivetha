package com.onlineroom.roombooking;

import java.util.List;
import java.util.Scanner;

import com.onlineroom.imp.HotelName;
import com.onlineroom.imp.Logger;




public class BookingDetails{
	private static Logger LOGGER = Logger.getInstance();

      public static void main(String[] args) {
    	  @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
  		LOGGER.debug("Enter Hotelid:");
  		int hotelid=s.nextInt();
	    HotelName c=new HotelName();
	    List<HotelName> list =c.getBookingDetails(hotelid);
		for (HotelName name : list) 
		{
			System.out.println(name.toString());
		}
		
		
	}

}
