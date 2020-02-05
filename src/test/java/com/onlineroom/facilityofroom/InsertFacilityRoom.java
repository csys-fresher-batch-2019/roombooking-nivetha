package com.onlineroom.facilityofroom;

import java.time.LocalDate;
import java.util.Scanner;

import com.onlineroom.imp.Logger;
import com.onlineroom.imp.RoomType;


public class InsertFacilityRoom {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		RoomType c=new RoomType();
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter User=");
		c.setUser(s.nextInt());
		
		LOGGER.debug("Enter Members=");
		c.setMembers(s.nextInt());
		
		LOGGER.debug("Enter RoomType =");
		c.setRoomType(s.next());
		
		LOGGER.debug("Enter BedType=");
		c.setBedType(s.next());
		
		LOGGER.debug("Enter CheckIn=");
		c.setCheckIn(LocalDate.parse(s.next()));
		
		LOGGER.debug("Enter CheckOut=");
		c.setCheckOut(LocalDate.parse(s.next()));
		
		LOGGER.debug("Enter Payment=");
		c.setPayment(s.next());
		
		c.insertfacilityroom(c);
	}

}
