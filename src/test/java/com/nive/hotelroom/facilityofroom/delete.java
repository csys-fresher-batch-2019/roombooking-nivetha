package com.nive.hotelroom.facilityofroom;

import java.util.Scanner;

import com.nive.hotelroom.dao.impl.RoomTypeImpl;
import com.nive.hotelroom.util.Logger;



public class delete {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
	LOGGER.debug("Payment:");
		String payment=s.nextLine();
		RoomTypeImpl c=new RoomTypeImpl();
		c.delete(payment);
	}

}
