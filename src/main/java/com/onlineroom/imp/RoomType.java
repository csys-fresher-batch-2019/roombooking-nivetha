package com.onlineroom.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.onlineroom.dao.RoomTypeInterfaceDAO;
import com.onlineroom.util.ConnectionUtil;

public class RoomType implements RoomTypeInterfaceDAO {
	private static Logger LOGGER = Logger.getInstance();
	private int user;
	private int hotel;
	private int members;
	private String roomType;
	private String bedType;
	private Date checkIn;
	private Date checkOut;
	private String payment;
	private String activeStatus;

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public int getHotel() {
		return hotel;
	}

	public void setHotel(int hotel) {
		this.hotel = hotel;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Override
	public String toString() {
		return "RoomType [user=" + user + ", hotel=" + hotel + ", members=" + members + ", roomType=" + roomType
				+ ", bedType=" + bedType + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", payment=" + payment
				+ ", activeStatus=" + activeStatus + "]";
	}

	public void insertfacilityroom(RoomType c) {
		String sql = "insert into room(hotel,us_er,members,room_type,bed_type,check_in,check_out,payment,active_status)values(?,?,?,?,?,?,?,?,?)";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, c.getHotel());
			ps.setInt(2, c.getUser());
			ps.setInt(3, c.getMembers());
			ps.setString(4, c.getRoomType());
			ps.setString(5, c.getBedType());
			ps.setDate(6, (java.sql.Date)c.getCheckIn());
			ps.setDate(7, (java.sql.Date)c.getCheckOut());
			ps.setString(8, c.getPayment());
	        ps.setString(9, c.getActiveStatus());
			int rows = ps.executeUpdate();
			LOGGER.debug("No of rows inserted :" + rows);
		} catch (Exception e) {
			LOGGER.debug(e);
		}

	}

	public void delete(String payment) {
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement()) {
			String sql = "delete from room where payment='" + payment + "'";
			LOGGER.debug(sql);
			int rows = stmt.executeUpdate(sql);
			LOGGER.debug("No of rows deleted :" + rows);
		} catch (Exception e) {
			LOGGER.debug(e);
		}

	}
	public String toString1() {
		return "RoomType [ user="+user+", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}

	public List<RoomType> getUserCheckInOut(int userid) {
		List<RoomType> list = new ArrayList<RoomType>();

		String sql = "select userid,check_in,check_out from room where userid=" + userid;
		try (Connection con = ConnectionUtil.getConnect();Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				@SuppressWarnings("unused")
				String User = rs.getString("userid");
				Date checkIn = rs.getDate("check_in");
				Date checkOut = rs.getDate("check_out");
				RoomType n=new RoomType();
				n.setUser(userid);
				n.setCheckIn(checkIn);
				n.setCheckOut(checkOut);
				list.add(n);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
		}
		return list;
	}

}
