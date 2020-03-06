package com.nive.hotelroom.hotelname;

import java.util.Scanner;

import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;
public class Updatetable {
	private static Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws DBException {
		Scanner s=new Scanner(System.in);
		HotelName al=new HotelName();
		LOGGER.debug("Enter id:");
		al.setHotelId(s.nextInt());
		s.nextLine();
		LOGGER.debug("Enter status");
		al.setStatus(s.nextLine());
  	  HotelDAO c=DAOFactory.getHotelDAO();
          c.updatetable(al);

}
}
