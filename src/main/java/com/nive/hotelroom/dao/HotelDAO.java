package com.nive.hotelroom.dao;

import java.util.List;
import com.nive.hotelroom.domain.HotelName;

public interface HotelDAO {
	
	
	public List<HotelName> getHotelDetails();
	
	public List<HotelName> getHotelDetails2();
	
	public List<HotelName> getHotelDetails1(String hotelName); 
    
	public List<HotelName> getHotelByRating(float rating);

	public List<HotelName> getHotelByLocation(String location);
     
	public List<HotelName>getBookingDetails(int hotel) ;
	
    public void hotel ( HotelName c);

    public void updatetable(int hotelId,String status);

   

}
