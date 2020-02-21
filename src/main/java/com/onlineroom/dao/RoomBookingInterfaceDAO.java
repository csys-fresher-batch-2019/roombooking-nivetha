package com.onlineroom.dao;

import java.util.List;

import com.onlineroom.imp.HotelName;

public interface RoomBookingInterfaceDAO {
	
	
	public List<HotelName> getHotelDetails();
	
	public List<HotelName> getHotelDetails2();
	
	public List<HotelName> getHotelDetails1(String hotelName); 
    
	public List<HotelName> getHotelByRating(float rating);

	public List<HotelName> getHotelByLocation(String location);
     
	public List<HotelName>getBookingDetails(int hotel) ;
	
    public void hotel ( HotelName c);

    public void updatetable(int hotelId,String status);

   

}
