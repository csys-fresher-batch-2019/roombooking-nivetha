package com.nive.hotelroom.dao;

import java.util.List;

import com.nive.hotelroom.domain.CustomerDetails;

public interface CustomerDAO {
	
	public List<CustomerDetails> getUserDetailsByEmail(String emailId);
	
	public List<CustomerDetails> getUserDetailsByPayment(int userId);
	
	//@SqlUpdate("insert into customer_table(user_id,user_name,mob_no,city,email_id,pass_word)values(?,?,?,?,?,?)")
	public void insertcustomerdetalis( CustomerDetails c);
	
	//@SqlUpdate( "update room set active_status='inactive', payment='paid' where userid=?")
	public void update(int userId);
	
	//@SqlUpdate("update customer_table set pass_word=? where email_id=? and pass_word=?")
	public void changePassword(String emailId, String pass,String password);
    
	public int getUserId(String emailid, String password);

}
