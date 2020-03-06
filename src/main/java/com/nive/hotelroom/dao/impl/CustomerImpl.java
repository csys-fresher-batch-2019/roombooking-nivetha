package com.nive.hotelroom.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.exception.ErrorConstant;
import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.util.ConnectionUtil;
import com.nive.hotelroom.util.Logger;

public class CustomerImpl implements CustomerDAO {
	private static final String ACTION_1 = "email_id";
	private static Logger LOGGER = Logger.getInstance();
	
	public List<CustomerDetails> getUserDetailsByEmail(CustomerDetails al)throws DBException {
		List<CustomerDetails> list = new ArrayList<CustomerDetails>();
		String sql = "select user_id,user_name,city,email_id from customer_table where email_id=?";
		try (Connection con = ConnectionUtil.getConnect();PreparedStatement pst=con.prepareStatement(sql)) 
		{
			LOGGER.debug(sql);
			pst.setString(1,al.getEmailId());
			ResultSet rs=pst.executeQuery();
			while (rs.next()) {
				int userid = rs.getInt("user_id");
				String username = rs.getString("user_name");
				String city = rs.getString("city");
				String emailId2 = rs.getString(ACTION_1);
				
			CustomerDetails n=new CustomerDetails();
			n.setUserId(userid);
			n.setUserName(username);
			n.setCity(city);
			n.setEmailId(emailId2);
			list.add(n);
					
			}
		} catch (Exception e)
		{
			LOGGER.debug(e);
			throw new DBException(ErrorConstant.INVALID_SELECT);
		}
		return list;
	}
	
	public List<CustomerDetails> getUserDetailsByPayment(CustomerDetails al)throws DBException {
		List<CustomerDetails> list = new ArrayList<CustomerDetails>();
		String sql = "select user_name,mob_no,email_id,city,(select payment from room where userid=?) as payment from customer_table where user_id=?";
		try (Connection con = ConnectionUtil.getConnect();PreparedStatement pst=con.prepareStatement(sql)) {
			LOGGER.debug(sql);
			pst.setInt(1, al.getUserId());
			pst.setInt(2, al.getUserId());
			ResultSet rs = pst.executeQuery(sql);
			while (rs.next()) {
				String userName = rs.getString("user_name");
				String mobno = rs.getString("mob_no");
				String emailId = rs.getString(ACTION_1);
				String City = rs.getString("city");
				String cash = rs.getString("payment");
				
				CustomerDetails n=new CustomerDetails();
				n.setUserName(userName);
				n.setMobNo(mobno);
				n.setEmailId(emailId);
				n.setCity(City);
				n.setPayment(cash);
				list.add(n);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
			throw new DBException(ErrorConstant.INVALID_SELECT);
		}
		return list;
	}

	public void insertcustomerdetalis(CustomerDetails c)throws DBException {
		String sql = "insert into customer_table(user_id,user_name,mob_no,city,email_id,pass_word)values(u_id_seq.nextval,?,?,?,?,?)";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, c.getUserName());
			ps.setString(2, c.getMobNo());
			ps.setString(3, c.getCity());
			ps.setString(4, c.getEmailId());
			ps.setString(5, c.getPassword());
			int rows = ps.executeUpdate();
			LOGGER.debug("No of rows inserted :" + rows);
		}

		catch (Exception e) {
			LOGGER.debug(e);
			throw new DBException(ErrorConstant. INVALID_ADD);

		}

	}

	public void update(CustomerDetails c)throws DBException {
		String sql = "update room set active_status='inactive', payment='paid' where userid=?";

		try (Connection con = ConnectionUtil.getConnect();PreparedStatement ps = con.prepareStatement(sql) ) {
			ps.setInt(1, c.getUserId());
			int rows = ps.executeUpdate(sql);
			LOGGER.debug("No of rows updated :" + rows);

		} catch (Exception e) {
			LOGGER.debug(e);
			throw new DBException(ErrorConstant. INVALID_UPDATE);

		}

	}
	public void changePassword(CustomerDetails c) throws DBException{
		String sql = "update customer_table set pass_word=? where email_id=? and pass_word=?";
		try (Connection con = ConnectionUtil.getConnect();PreparedStatement ps = con.prepareStatement(sql)) 
		{
			ps.setString(1,c.getPassword());
			ps.setString(2,c.getEmailId());
			ps.setString(3,c.getPassword());
	        System.out.println(sql);
			int row=ps.executeUpdate(sql);
	        LOGGER.debug(row);
	        if(row==1)
	        {
	        	LOGGER.debug("Update Success");
	        }
	        else
	        {
	        	LOGGER.debug("Invalid EmailId/Password");
	        }
			
		} catch (Exception e)
		{
			LOGGER.debug(e);
			throw new DBException(ErrorConstant. INVALID_UPDATE);

		}
		return;
	}


	public int getUserId(CustomerDetails c)throws DBException{
		String sql="select user_id from customer_table where email_id=? and pass_word=?";
		System.out.println(sql);
		int v= 0;
		try(Connection con = ConnectionUtil.getConnect();PreparedStatement pst = con.prepareStatement(sql);){
		      pst.setString(1,c.getEmailId() );
		      pst.setString(2, c.getPassword());
		try(ResultSet row =pst. executeQuery();)
		{
			
			
		                if(row.next()) {
		               	v= row.getInt("user_Id");
		               	
		                }
		  }
		}
		catch(Exception e)
		{
		   LOGGER.error(e);
		   throw new DBException(ErrorConstant.INVALID_SELECT);
		        }
		   return v;
	}
	}

