package com.nive.hotelroom.hotelname;

import java.util.List;
import java.util.Scanner;

import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;


public class Rating {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter Rating:");
		float rating=s.nextFloat();
  	  HotelDAO c=DAOFactory.getHotelDAO();
		List<HotelName> list =c.getHotelByRating(rating);
		for (HotelName name : list) 
		{
			System.out.println(name.toString());
		}
		
	}

}
