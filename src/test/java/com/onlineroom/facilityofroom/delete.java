package com.onlineroom.facilityofroom;

import java.util.Scanner;

import com.onlineroom.imp.Logger;
import com.onlineroom.imp.RoomType;



public class delete {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
	LOGGER.debug("Payment:");
		String payment=s.nextLine();
		RoomType c=new RoomType();
		c.delete(payment);
	}

}
