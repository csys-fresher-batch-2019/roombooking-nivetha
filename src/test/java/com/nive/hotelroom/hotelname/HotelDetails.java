package com.nive.hotelroom.hotelname;

import java.util.List;
import java.util.Scanner;

import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;

public class HotelDetails {
	private static Logger LOGGER = Logger.getInstance();
	public static void main(String[] args) throws DBException {
		Scanner s=new Scanner(System.in);
  	  HotelDAO c=DAOFactory.getHotelDAO();
		List<HotelName> list =c.getHotelDetails();
		for (HotelName name : list) 
		{
			System.out.println(name.toString());
		}
		
	}

}
