package com.onlineroom.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.onlineroom.dao.CustomerInterfaceDAO;
import com.onlineroom.util.ConnectionUtil;

public class Customer implements CustomerInterfaceDAO {
	private static final String ACTION_1 = "email_id";
	private static Logger LOGGER = Logger.getInstance();
	private int userId;
	private String userName;
	private String mobNo;
	private String city;
	private String emailId;
	private String password;
	private String payment;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", userName=" + userName + ", mobNo=" + mobNo + ", city=" + city
				+ ", emailId=" + emailId + ", password=" + password + ", payment=" + payment + "]";
	}
	public String toString1() {
		return "Customer [userId=" + userId + ", userName=" + userName + ", city=" + city+ ", emailId=" + emailId + "]";
	}

	public List<Customer> getUserDetailsByEmail(String emailId) {
		List<Customer> list = new ArrayList<Customer>();
		String sql = "select user_id,user_name,city,email_id from customer_table where email_id='" + emailId + "'";
		
		try (Connection con = ConnectionUtil.getConnect();Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) 
		{
			LOGGER.debug(sql);
			while (rs.next()) {
				int userid = rs.getInt("user_id");
				String username = rs.getString("user_name");
				String city = rs.getString("city");
				String emailId2 = rs.getString(ACTION_1);
				
			Customer n=new Customer();
			n.setUserId(userid);
			n.setUserName(username);
			n.setCity(city);
			n.setEmailId(emailId2);
			list.add(n);
					
			}
		} catch (Exception e)
		{
			LOGGER.debug(e);
		}
		return list;
	}
	public String toString2() {
		return "Customer [ userName=" + userName + ", mobNo=" + mobNo + ", city=" + city
				+ ", emailId=" + emailId + ", payment=" + payment + "]";
	}

	public List<Customer> getUserDetailsByPayment(int userId) {
		List<Customer> list = new ArrayList<Customer>();
		String sql = "select user_name,mob_no,email_id,city,(select payment from room where userid=" + userId
				+ ") as payment from customer_table where user_id=" + userId;
		try (Connection con = ConnectionUtil.getConnect();Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				String userName = rs.getString("user_name");
				String mobno = rs.getString("mob_no");
				String emailId = rs.getString(ACTION_1);
				String City = rs.getString("city");
				String cash = rs.getString("payment");
				
				Customer n=new Customer();
				n.setUserName(userName);
				n.setMobNo(mobno);
				n.setEmailId(emailId);
				n.setCity(City);
				n.setPayment(cash);
				list.add(n);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
		}
		return list;
	}

	public void insertcustomerdetalis(Customer c) {
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
		}

	}

	public void update(int userId) {
		String sql = "update room set active_status='inactive', payment='paid' where userid=" + userId;

		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement()) {
			LOGGER.debug(sql);
			int rows = stmt.executeUpdate(sql);
			LOGGER.debug("No of rows updated :" + rows);

		} catch (Exception e) {
			LOGGER.debug(e);
		}

	}

	public String loginid(String emailId, String password) {
		String sql = "select email_id,pass_word from customer_table where email_id='" + emailId + "'";
		try (Connection con = ConnectionUtil.getConnect();Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) 
		{
			LOGGER.debug(sql);
			String st=null;
			if (rs.next()) {
				st="success";
				String EmailId = rs.getString(ACTION_1);
				// LOGGER.debug(EmailId);
				String Password = rs.getString("pass_word");
				// LOGGER.debug(Password);
				if (emailId.equals(EmailId) && password.equals(Password)) {

					LOGGER.debug("Login Successfull");
				return st;
				} else {
					st="failure";
					LOGGER.debug("Login failed");
					return st;
				}
			}
		} catch (Exception e)
		{
			LOGGER.debug(e);
		}
		return null;

	}
	public void changePassword(String emailId, String pass,String password) {
		try (Connection con = ConnectionUtil.getConnect();Statement stmt = con.createStatement()) 
		{
			String sql = "update customer_table set pass_word='"+password+"' where email_id='"+emailId+"' and pass_word='"+pass+"'";
	        System.out.println(sql);
			int row=stmt.executeUpdate(sql);
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
		}
		return;
	}


	public int getUserId(String emailid, String password)  {
		String sql="select user_id from customer_table where email_id=? and pass_word=?";
		System.out.println(sql);
		int v= 0;
		try(Connection con = ConnectionUtil.getConnect();PreparedStatement pst = con.prepareStatement(sql);){
		      pst.setString(1, emailid);
		      pst.setString(2, password);
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
		        }
		   return v;
	}
	}

