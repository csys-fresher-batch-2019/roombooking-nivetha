package com.onlineroom.dao;

import com.onlineroom.imp.HotelName;

public interface RoomBookingInterfaceDAO {
	
	public String getHotelDetails(String hotelName);
	
	public String getHotelByRating(float rating);
	
    public String getHotelByLocation(String location);
 
	public String getHotelNameList();

	public String getBookingDetails(int hotel);
	
    public void hotel (HotelName c);
    
    
    public void updatetable(int hotelId);
   

}
