package com.nive.hotelroom.facilityofroom;

import java.util.Scanner;

import com.nive.hotelroom.dao.impl.RoomTypeImpl;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.util.Logger;



public class delete {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws DBException 
	{
		RoomType p=new RoomType();
		Scanner s=new Scanner(System.in);
	    LOGGER.debug("Payment:");
		p.setPayment(s.nextLine());
		RoomTypeImpl c=new RoomTypeImpl();
		c.delete(p);
	}

}
