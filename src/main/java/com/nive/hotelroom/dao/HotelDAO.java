package com.nive.hotelroom.dao;

import java.util.List;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.exception.DBException;

public interface HotelDAO {
	
	
	public List<HotelName> getHotelDetails()throws DBException;
	
	public List<HotelName> getHotelDetails2()throws DBException;
	
	public List<HotelName> getHotelDetails1(HotelName al)throws DBException; 
    
	public List<HotelName> getHotelByRating(HotelName al)throws DBException;

	public List<HotelName> getHotelByLocation(HotelName al)throws DBException;
     
	public List<HotelName>getBookingDetails(HotelName al)throws DBException;
	
    public void hotel ( HotelName al)throws DBException;

    public void updatetable(HotelName al)throws DBException;

   

}
