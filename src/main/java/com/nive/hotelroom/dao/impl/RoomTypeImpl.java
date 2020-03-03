package com.nive.hotelroom.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nive.hotelroom.dao.RoomTypeDAO;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.util.ConnectionUtil;
import com.nive.hotelroom.util.Logger;

public class RoomTypeImpl implements RoomTypeDAO {
	private static Logger LOGGER = Logger.getInstance();
	

	public void insertfacilityroom(RoomType c) {
		String sql = "insert into room(hotel,userid,members,room_type,bed_type,check_in,check_out)values(?,?,?,?,?,?,?)";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, c.getHotel());
			ps.setInt(2, c.getUser());
			ps.setInt(3, c.getMembers());
			ps.setString(4, c.getRoomType());
			ps.setString(5, c.getBedType());
			
			ps.setDate(6, (java.sql.Date)c.getCheckIn() );
			ps.setDate(7, (java.sql.Date) c.getCheckOut());
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
	

	public List<RoomType> getUserCheckInOut(int userid) {
		List<RoomType> list = new ArrayList<RoomType>();

		String sql = "select userid,check_in,check_out from room where userid=" + userid;
		try (Connection con = ConnectionUtil.getConnect();Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				@SuppressWarnings("unused")
			     int user = rs.getInt("userid");
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
	public List<RoomType> getUserbookeddetails(int userid){
	List<RoomType> list = new ArrayList<RoomType>();

	   String sql="select * from room where userid="+userid;
		try (Connection con = ConnectionUtil.getConnect();Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				@SuppressWarnings("unused")
				int user = rs.getInt("userid");
				int hotelid=rs.getInt("hotel");
				int member=rs.getInt("members");
				String roomType=rs.getString("room_type");
				String bedType=rs.getString("bed_type");
				Date checkIn = rs.getDate("check_in");
				Date checkOut = rs.getDate("check_out");
				String payment=rs.getString("payment");
				String activeStatus=rs.getString("active_status");
				RoomType n=new RoomType();
				n.setUser(userid);
				n.setHotel(hotelid);
				n.setMembers(member);
				n.setRoomType(roomType);
				n.setBedType(bedType);
				n.setCheckIn(checkIn);
				n.setCheckOut(checkOut);
				n.setPayment(payment);
				n.setActiveStatus(activeStatus);
				list.add(n);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
		}
		return list;
	}

}
