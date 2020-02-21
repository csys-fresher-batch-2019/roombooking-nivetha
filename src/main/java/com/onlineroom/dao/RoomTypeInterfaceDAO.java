package com.onlineroom.dao;

import java.util.List;

import com.onlineroom.imp.RoomType;

public interface RoomTypeInterfaceDAO {
	
	public List<RoomType> getUserCheckInOut(int userid);
	
	public void insertfacilityroom(RoomType c);
	
	public void delete(String payment);
	
	public List<RoomType> getUserbookeddetails(int userid);

}
