package com.onlineroom.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.onlineroom.dao.RoomBookingInterfaceDAO;
import com.onlineroom.util.ConnectionUtil;
import com.onlineroom.util.FileUtil;

public class HotelName implements RoomBookingInterfaceDAO {
	private static Logger LOGGER = Logger.getInstance();
	private int hotelId;
	private String hotelName;
	private String location;
	private float rating;
	private String status;
	private String RoomType;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String roomType) {
		RoomType = roomType;
	}

	@Override
	public String toString() {
		return "HotelName [hotelId=" + hotelId + ", hotelName=" + hotelName + ", location=" + location + ", rating="
				+ rating + ", status=" + status + ", RoomType=" + RoomType + "]";
	}

	public String getHotelDetails(String hotelName) 
	{
		String sql = "select * from hotel where hotel_name='" + hotelName + "'";
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql))
		{
			LOGGER.debug(sql);
			while (rs.next()) {
				String hotelname = rs.getString("hotel_name");
				LOGGER.debug("HotelName=" + hotelname);
				String location1 = rs.getString("location");
				LOGGER.debug("Location=" + location1);
				float rating1 = rs.getFloat("rating");
				LOGGER.debug("Rating=" + rating1);
				String Status = rs.getString("status");
				LOGGER.debug("Status=" + Status);
				String HotelId = rs.getString("hotel_id");
				LOGGER.debug("HotelId=" + HotelId);
				String roomtype = rs.getString("RoomType");
				LOGGER.debug("Roomtype=" + roomtype);
				String result = "HotelName=" + hotelname + "\n" + "Location=" + location1 + "\n" + "Rating=" + rating1
						+ "\n" + "Status=" + Status + "\n" + "HotelId=" + HotelId + "\n" + "Roomtype=" + roomtype;
				FileUtil.WriteToFile("HotelNameResult.txt", result);
				LOGGER.debug("Write Successfully");
			}

		} catch (Exception e) {
			LOGGER.debug(e);
		}

		return null;
	}

	public String getHotelNameList() 
	{			
		String sql = "select * from hotel";
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next())
			{
				String hotelname = rs.getString("hotelName");
				LOGGER.debug("HotelName=" + hotelname);
			}

		} catch (Exception e)
		{
			LOGGER.debug(e);
		}

		return null;
	}

	public String getHotelByRating(float rating) 
	{
		String sql = "select hotel_name,rating,location,status from hotel where rating=" + rating + "";
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				String hotelname1 = rs.getString("hotel_name");
				LOGGER.debug(hotelname1);
				String location1 = rs.getString("location");
				LOGGER.debug(location1);
				float rating1 = rs.getFloat("rating");
				LOGGER.debug(rating1);
				String Status = rs.getString("status");
				LOGGER.debug(Status);
			}

		} catch (Exception e) {
			LOGGER.debug(e);
		}
		return null;

	}

	public String getHotelByLocation(String location)
	{
		String sql = "select hotel_name,location,rating,status from hotel  where location='" + location + "'";
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				String hotelname2 = rs.getString("hotel_name");
				LOGGER.debug(hotelname2);
				String location1 = rs.getString("location");
				LOGGER.debug(location1);
				float rating2 = rs.getFloat("rating");
				LOGGER.debug(rating2);
				String Status = rs.getString("status");
				LOGGER.debug(Status);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
		}
		return null;
	}

	public String getBookingDetails(int hotel) 
	{
		String sql = "select c.hotel_name,r.us_er,r.members,r.room_type,r.bed_type,r.check_in,r.check_out,r.payment from hotel c  inner join room r on c.hotel_id=r.hotel where hotel_id="+ hotel;
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				String hotelname2 = rs.getString("hotel_name");
				LOGGER.debug(hotelname2);
				int Member = rs.getInt("members");
				LOGGER.debug(Member);
				String Room = rs.getString("room_type");
				LOGGER.debug(Room);
				String BedType = rs.getString("bed_type");
				LOGGER.debug(BedType);
				String InDate = rs.getString("check_in");
				LOGGER.debug(InDate);
				String OutDate = rs.getString("check_out");
				LOGGER.debug(OutDate);
				String Payment = rs.getString("payment");
				LOGGER.debug(Payment);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
		}
		return null;
	}

	public void hotel(HotelName c) 
	{
		String sql = "insert into hotel(hotel_id,hotel_name,location,rating,status,RoomType)values(?,?,?,?,?,?,?)";
		try (Connection con = ConnectionUtil.getConnect();PreparedStatement ps = con.prepareStatement(sql)) 
		{
			ps.setInt(1, c.getHotelId());
			ps.setString(2, c.getHotelName());
			ps.setString(3, c.getLocation());
			ps.setFloat(4, c.getRating());
			ps.setString(5, c.getStatus());
			ps.setString(6, c.getRoomType());
			int rows = ps.executeUpdate();
			LOGGER.debug("No of rows inserted :" + rows);
		} catch (Exception e) {
			LOGGER.debug(e);
		}

	}

	public void updatetable(int hotelId) {
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement()) {
			String sql = "update hotel set status='not avaliable' where hotel_id=" + hotelId;
			LOGGER.debug(sql);
			int rows = stmt.executeUpdate(sql);
			LOGGER.debug("No of rows updated :" + rows);
		} catch (Exception e) {
			LOGGER.debug(e);
		}

	}
}