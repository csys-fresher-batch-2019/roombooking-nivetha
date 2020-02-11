package com.onlineroom.dao;

import java.util.List;

import com.onlineroom.imp.HotelName;

public interface RoomBookingInterfaceDAO {
	
	public List<HotelName> getHotelDetails(String hotelName);
	
	public List<HotelName> getHotelByRating(float rating);

	public List<HotelName> getHotelByLocation(String location);
 
    public List<HotelName> getHotelNameList();

	public List<HotelName>getBookingDetails(int hotel) ;
	
    public void hotel (HotelName c);
    
    public void updatetable(int hotelId);

   

}
