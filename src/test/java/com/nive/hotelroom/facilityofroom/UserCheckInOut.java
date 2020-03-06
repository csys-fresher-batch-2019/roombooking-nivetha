package com.nive.hotelroom.facilityofroom;
import java.util.List;
import java.util.Scanner;
import com.nive.hotelroom.dao.RoomTypeDAO;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;
import com.nive.hotelroom.util.Logger;

public class UserCheckInOut {
	private static Logger LOGGER = Logger.getInstance();
	public static void main(String[] args) throws DBException {
		Scanner s=new Scanner(System.in);
		RoomType p=new RoomType();
		LOGGER.debug("Enter userid:");
		p.setUser(s.nextInt());
		RoomTypeDAO c=DAOFactory.getRoomTypeDAO();
		List<RoomType> list =c.getUserCheckInOut(p);
		for (RoomType name : list) 
		{
			System.out.println(name.toString1());
		}
		
		
	}

}
