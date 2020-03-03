package com.nive.hotelroom.factory;

import com.nive.hotelroom.dao.AdminDAO;
import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.dao.RoomTypeDAO;
import com.nive.hotelroom.dao.impl.AdminLoginImpl;
import com.nive.hotelroom.dao.impl.CustomerImpl;
import com.nive.hotelroom.dao.impl.HotelNameImpl;
import com.nive.hotelroom.dao.impl.RoomTypeImpl;

public class DAOFactory {
	
	public static CustomerDAO getCustomerDAO() {
		return new CustomerImpl();
	}
	public static AdminDAO getAdminDAO() {
		return new AdminLoginImpl();
	}
	public static HotelDAO getHotelDAO() {
		return new HotelNameImpl() ;
	}
	public static RoomTypeDAO getRoomTypeDAO() {
		return new RoomTypeImpl();
	}
	
}
