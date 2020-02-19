package com.onlineroom.dao;

import java.util.List;

import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.onlineroom.imp.HotelName;

public interface RoomBookingInterfaceDAO {
	
	@SqlQuery("select * from hotel")
	public List<HotelName> getHotelDetails();
	
	@SqlQuery("select hotel_id,hotel_name,location,rating,status,roomtype from hotel where hotel_name=?")
	public List<HotelName> getHotelDetails1(String hotelName); 
    
	@SqlQuery("select hotel_name,rating,location,status from hotel where rating=?")
	public List<HotelName> getHotelByRating(float rating);

	@SqlQuery("select hotel_name,location,rating,status from hotel  where location=?")
	public List<HotelName> getHotelByLocation(String location);
     
	@SqlQuery("select c.hotel_name,r.userid,r.members,r.room_type,r.bed_type,r.check_in,r.check_out,r.payment from hotel c  inner join room r on c.hotel_id=r.hotel where hotel_id=?")
	public List<HotelName>getBookingDetails(int hotel) ;
	
	@SqlUpdate("insert into hotel(hotel_id,hotel_name,location,rating,status,RoomType,pic)values(?,?,?,?,?,?,?)")
    public void hotel (@BindBean HotelName c);
    
	

    public void updatetable(int hotelId,String status);

   

}
