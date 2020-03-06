package com.nive.hotelroom.dao;

import java.util.List;

import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.exception.DBException;

public interface CustomerDAO {
	
	public List<CustomerDetails> getUserDetailsByEmail(CustomerDetails al)throws DBException;
	
	public List<CustomerDetails> getUserDetailsByPayment(CustomerDetails al)throws DBException;
	
	public void insertcustomerdetalis( CustomerDetails c)throws DBException;
	
	public void update(CustomerDetails c)throws DBException;
	
	public void changePassword(CustomerDetails c)throws DBException;
    
	public int getUserId(CustomerDetails c)throws DBException;

}
