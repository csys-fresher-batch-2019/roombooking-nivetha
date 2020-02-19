package com.onlineroom.dao;

import java.util.List;

import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.onlineroom.imp.Customer;

public interface CustomerInterfaceDAO {
	
	@SqlQuery("select user_id,user_name,city,email_id from customer_table where email_id=?")
	public List<Customer> getUserDetailsByEmail(String emailId);
	
	@SqlQuery("select user_name,mob_no,email_id,city,(select payment from room where userid=?) as payment from customer_table where user_id=?")
	public List<Customer> getUserDetailsByPayment(int userId);
	
	@SqlUpdate("insert into customer_table(user_id,user_name,mob_no,city,email_id,pass_word)values(?,?,?,?,?,?)")
	public void insertcustomerdetalis(@BindBean Customer c);
	
	@SqlQuery( "select email_id,pass_word from customer_table where email_id=?")
	public String loginid(String emailId,String password);
	
	@SqlUpdate( "update room set active_status='inactive', payment='paid' where userid=?")
	public void update(int userId);
	
	@SqlUpdate("update customer_table set pass_word=? where email_id=? and pass_word=?")
	public void changePassword(String emailId, String pass,String password);
    
	public int getUserId(String emailid, String password);

}
