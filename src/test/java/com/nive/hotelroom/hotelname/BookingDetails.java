package com.nive.hotelroom.hotelname;

import java.util.List;
import java.util.Scanner;

import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;

public class BookingDetails{
	private static Logger LOGGER = Logger.getInstance();

      public static void main(String[] args) {
    	  HotelDAO c=DAOFactory.getHotelDAO();
    	  @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
  		LOGGER.debug("Enter Hotelid:");
  		int hotelid=s.nextInt();
	    
	    List<HotelName> list =c.getBookingDetails(hotelid);
		for (HotelName name : list) 
		{
			System.out.println(name.toString());
		}
		
		
	}

}
