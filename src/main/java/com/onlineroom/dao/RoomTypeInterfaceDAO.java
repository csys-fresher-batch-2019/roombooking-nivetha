package com.onlineroom.dao;

import com.onlineroom.imp.RoomType;

public interface RoomTypeInterfaceDAO {
	
	public String getUserCheckInOut(int userid);
	
	public void insertfacilityroom(RoomType c);
	
	public void delete(String payment);

}
