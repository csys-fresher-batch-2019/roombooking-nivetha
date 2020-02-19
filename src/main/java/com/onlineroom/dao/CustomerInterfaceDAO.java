package com.onlineroom.dao;

import java.util.List;



import com.onlineroom.imp.Customer;

public interface CustomerInterfaceDAO {
	
	public List<Customer> getUserDetailsByEmail(String emailId);
	
	public List<Customer> getUserDetailsByPayment(int userId);
	
	//@SqlUpdate("insert into customer_table(user_id,user_name,mob_no,city,email_id,pass_word)values(?,?,?,?,?,?)")
	public void insertcustomerdetalis( Customer c);
	
	//@SqlQuery( "select email_id,pass_word from customer_table where email_id=?")
	public String loginid(String emailId,String password);
	
	//@SqlUpdate( "update room set active_status='inactive', payment='paid' where userid=?")
	public void update(int userId);
	
	//@SqlUpdate("update customer_table set pass_word=? where email_id=? and pass_word=?")
	public void changePassword(String emailId, String pass,String password);
    
	public int getUserId(String emailid, String password);

}
