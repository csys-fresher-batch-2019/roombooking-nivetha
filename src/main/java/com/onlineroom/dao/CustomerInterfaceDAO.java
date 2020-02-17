package com.onlineroom.dao;

import java.util.List;

import com.onlineroom.imp.Customer;

public interface CustomerInterfaceDAO {
	
	public List<Customer> getUserDetailsByEmail(String emailId);
	
	public List<Customer> getUserDetailsByPayment(int userId);
	
	public void insertcustomerdetalis(Customer c);
	
	public String loginid(String emailId,String password);
	
	public void update(int userId);
	
	public void changePassword(String emailId, String pass,String password);


}
