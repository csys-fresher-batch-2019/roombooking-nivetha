package com.onlineroom.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import com.onlineroom.dao.RoomTypeInterfaceDAO;
import com.onlineroom.util.ConnectionUtil;

public class RoomType implements RoomTypeInterfaceDAO {
	private static Logger LOGGER = Logger.getInstance();
	private int user;
	private int hotel;
	private int members;
	private String roomType;
	private String bedType;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private String payment;

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

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "RoomType [user=" + user + ", hotel=" + hotel + ", members=" + members + ", roomType=" + roomType
				+ ", bedType=" + bedType + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", payment=" + payment
				+ "]";
	}

	public void insertfacilityroom(RoomType c) {
		String sql = "insert into room(hotel,us_er,members,room_type,bed_type,check_in,check_out,payment)values(?,?,?,?,?,?,?,?)";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, c.getHotel());
			ps.setInt(2, c.getUser());
			ps.setInt(3, c.getMembers());
			ps.setString(4, c.getRoomType());
			ps.setString(5, c.getBedType());
			ps.setDate(6, java.sql.Date.valueOf(c.getCheckIn()));
			ps.setDate(7, java.sql.Date.valueOf(c.getCheckOut()));
			ps.setString(8, c.getPayment());
			int rows = ps.executeUpdate();
			LOGGER.debug("No of rows inserted :" + rows);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void delete(String payment) {
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement()) {
			String sql = "delete from room where payment='" + payment + "'";
			LOGGER.debug(sql);
			int rows = stmt.executeUpdate(sql);
			LOGGER.debug("No of rows deleted :" + rows);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getUserCheckInOut(int userid) {
		String sql = "select userid,check_in,check_out from room where userid=" + userid;
		try (Connection con = ConnectionUtil.getConnect();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				String Userid = rs.getString("userid");
				LOGGER.debug("Id=" + Userid);
				String CheckIn = rs.getString("check_in");
				LOGGER.debug("In=" + CheckIn);
				String CheckOut = rs.getString("check_out");
				LOGGER.debug("Out=" + CheckOut);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
