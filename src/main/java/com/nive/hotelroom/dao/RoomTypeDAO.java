package com.nive.hotelroom.dao;

import java.util.List;
import com.nive.hotelroom.domain.RoomType;

public interface RoomTypeDAO {
	
	public List<RoomType> getUserCheckInOut(int userid);
	
	public void insertfacilityroom(RoomType c);
	
	public void delete(String payment);
	
	public List<RoomType> getUserbookeddetails(int userid);

}
//