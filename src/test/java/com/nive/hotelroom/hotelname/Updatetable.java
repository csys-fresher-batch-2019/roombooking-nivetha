package com.nive.hotelroom.hotelname;

import java.util.Scanner;

import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;
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
  	  HotelDAO c=DAOFactory.getHotelDAO();

				c.updatetable(hotelId, status);

}
}
