package com.onlineroom.dao;

import com.onlineroom.imp.Customer;

public interface CustomerInterfaceDAO {
	
	public String getUserDetailsByEmail(String emailId);
	
	public String getUserDetailsByPayment(int userId);
	
	public void insertcustomerdetalis(Customer c);
	
	public void loginid(String emailId,String password);
	
	public void update(int userId);

}
