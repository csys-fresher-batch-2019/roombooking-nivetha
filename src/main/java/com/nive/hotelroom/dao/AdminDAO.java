package com.nive.hotelroom.dao;

import com.nive.hotelroom.domain.AdminLogin;
import com.nive.hotelroom.exception.DBException;

public interface AdminDAO {
	
	public String login(AdminLogin al)throws DBException;


}
