package com.nive.hotelroom.dao;

import java.util.List;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.exception.DBException;

public interface RoomTypeDAO {
	
	public List<RoomType> getUserCheckInOut(RoomType al)throws DBException;
	
	public void insertfacilityroom(RoomType c)throws DBException;
	
	public void delete(RoomType al)throws DBException;
	
	public List<RoomType> getUserbookeddetails(RoomType al)throws DBException;

}
//