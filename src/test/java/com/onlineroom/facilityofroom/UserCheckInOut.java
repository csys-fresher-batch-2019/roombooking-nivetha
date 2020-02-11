package com.onlineroom.facilityofroom;

import java.util.List;
import java.util.Scanner;

import com.onlineroom.imp.Logger;
import com.onlineroom.imp.RoomType;


public class UserCheckInOut {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter userid:");
		int userid=s.nextInt();
		RoomType c=new RoomType();
		List<RoomType> list =c.getUserCheckInOut(userid);
		for (RoomType name : list) 
		{
			System.out.println(name.toString1());
		}
		
		
	}

}
