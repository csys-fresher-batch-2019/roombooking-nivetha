package com.onlineroom.roombooking;

import java.util.Scanner;

import com.onlineroom.imp.HotelName;
import com.onlineroom.imp.Logger;


public class Updatetable {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter id:");
		int hotelId=s.nextInt();
		s.nextLine();
		LOGGER.debug("Enter status");
		String status=s.nextLine();
				HotelName c=new HotelName();
				c.updatetable(hotelId, status);

}
}
