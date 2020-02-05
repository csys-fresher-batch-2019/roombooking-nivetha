package com.onlineroom.facilityofroom;

import java.util.Scanner;

import com.onlineroom.imp.Logger;
import com.onlineroom.imp.RoomType;


public class UserCheckInOut {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter userid:");
		int userid=s.nextInt();
		RoomType c=new RoomType();
		c.getUserCheckInOut(userid);
		
	}

}
