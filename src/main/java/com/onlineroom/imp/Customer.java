package com.onlineroom.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import com.onlineroom.dao.CustomerInterfaceDAO;
import com.onlineroom.util.ConnectionUtil;

public class Customer implements CustomerInterfaceDAO {
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

	public String getUserDetailsByEmail(String emailId) {
		String sql = "select user_id,user_name,city,email_id from customer_table where email_id='" + emailId + "'";
		try (Connection con = ConnectionUtil.getConnect();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				int userId = rs.getInt("user_id");
				LOGGER.debug(userId);
				String userName = rs.getString("user_name");
				LOGGER.debug(userName);
				String City = rs.getString("city");
				LOGGER.debug(City);
				String emailId2 = rs.getString("email_id");
				LOGGER.debug(emailId2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getUserDetailsByPayment(int userId) {
		String sql = "select user_name,mob_no,email_id,city,(select payment from room where userid=" + userId
				+ ") as payment from customer_table where user_id=" + userId;
		try (Connection con = ConnectionUtil.getConnect();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				String userName = rs.getString("user_name");
				LOGGER.debug(userName);
				String mobno = rs.getString("mob_no");
				LOGGER.debug(mobno);
				String emailId = rs.getString("email_id");
				LOGGER.debug(emailId);
				String City = rs.getString("city");
				LOGGER.debug(City);
				String cash = rs.getString("payment");
				LOGGER.debug(cash);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void insertcustomerdetalis(Customer c) {
		String sql = "insert into customer_table(user_id,user_name,mob_no,city,email_id,pass_word)values(?,?,?,?,?,?)";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, c.getUserId());
			ps.setString(2, c.getUserName());
			ps.setString(3, c.getMobNo());
			ps.setString(4, c.getCity());
			ps.setString(5, c.getEmailId());
			ps.setString(6, c.getPassword());

			int rows = ps.executeUpdate();
			LOGGER.debug("No of rows inserted :" + rows);
			con.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void update(int userId) {
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement()) {
			String sql = "update customer_table set active_status='inactive' where user_id=" + userId;
			LOGGER.debug(sql);
			int rows = stmt.executeUpdate(sql);
			LOGGER.debug("No of rows updated :" + rows);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void loginid(String emailId, String password) {
		String sql = "select email_id,pass_word from customer_table where email_id='" + emailId + "'";
		try (Connection con = ConnectionUtil.getConnect();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			if (rs.next()) {
				String EmailId = rs.getString("email_id");
				// LOGGER.debug(EmailId);
				String Password = rs.getString("pass_word");
				// LOGGER.debug(Password);
				if (emailId.equals(EmailId) && password.equals(Password)) {

					LOGGER.debug("Login Successfull");
				} else {
					LOGGER.debug("Login failed");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
