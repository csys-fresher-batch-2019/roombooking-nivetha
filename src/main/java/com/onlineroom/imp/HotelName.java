package com.onlineroom.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.onlineroom.dao.RoomBookingInterfaceDAO;
import com.onlineroom.util.ConnectionUtil;

public class HotelName implements RoomBookingInterfaceDAO {
	private static final String ACTION_1 = "hotel_name"; 
	private static final String ACTION_2 = "location";
	private static final String ACTION_3 = "rating";
	private static final String ACTION_4 = "status";
	private static Logger LOGGER = Logger.getInstance();
	private int hotelId;
	private String hotelName;
	private String location;
	private float rating;
	private String status;
	private String roomType;
	private String bedType;
	private int member;
	private String room;
	private String inDate;
	private String outDate;
	private String payment;
    private String pic;
	
	
	public static Logger getLOGGER() {
		return LOGGER;
	}
	public static void setLOGGER(Logger lOGGER) {
		LOGGER = lOGGER;
	}
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
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	public String getOutDate() {
		return outDate;
	}
	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String Pic) {
		this.pic = Pic;
	}
	public static String getAction1() {
		return ACTION_1;
	}
	public static String getAction2() {
		return ACTION_2;
	}
	public static String getAction3() {
		return ACTION_3;
	}
	public static String getAction4() {
		return ACTION_4;
	}
	@Override
	public String toString() {
		return "HotelName [hotelId=" + hotelId + ", hotelName=" + hotelName + ", location=" + location + ", rating="
				+ rating + ", status=" + status + ", roomType=" + roomType + ", bedType=" + bedType + ", member="
				+ member + ", room=" + room + ", inDate=" + inDate + ", outDate=" + outDate + ", payment=" + payment
				+ ", pic=" + pic + "]";
	}
	
	public List<HotelName> getHotelDetails() 
	{
		List<HotelName> list = new ArrayList<HotelName>();

		String sql = "select * from hotel";
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql))
		{
			LOGGER.debug(sql);
			while (rs.next()) {
				String hotelname = rs.getString( ACTION_1);
				String location1 = rs.getString(ACTION_2 );
				float rating1 = rs.getFloat(ACTION_3 );
				String Status = rs.getString(ACTION_4);
				int hotelId = rs.getInt("hotel_id");
				String roomtype = rs.getString("RoomType");
				String pic=rs.getString("pic");
				
				HotelName n=new HotelName();
				n.setHotelName(hotelname);
				n.setLocation(location1);
				n.setRating(rating1);
				n.setStatus(Status);
				n.setHotelId(hotelId);
				n.setRoomType(roomtype);
				n.setPic(pic);
				list.add(n);

			}

		} catch (Exception e) {
			LOGGER.debug(e);
		}

		return list;
	}
	
	public List<HotelName> getHotelDetails2() 
	{
		List<HotelName> list = new ArrayList<HotelName>();

		String sql = "select * from hotel";
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql))
		{
			LOGGER.debug(sql);
			while (rs.next()) {
				String hotelname = rs.getString( ACTION_1);
				String location1 = rs.getString(ACTION_2 );
				float rating1 = rs.getFloat(ACTION_3 );
				String Status = rs.getString(ACTION_4);
				int hotelId = rs.getInt("hotel_id");
				String roomtype = rs.getString("RoomType");
		
				HotelName n=new HotelName();
				n.setHotelName(hotelname);
				n.setLocation(location1);
				n.setRating(rating1);
				n.setStatus(Status);
				n.setHotelId(hotelId);
				n.setRoomType(roomtype);
	
				list.add(n);

			}

		} catch (Exception e) {
			LOGGER.debug(e);
		}

		return list;
	}

	public List<HotelName> getHotelDetails1(String hotelName) 
	{
		List<HotelName> list = new ArrayList<HotelName>();

		String sql = "select * from hotel where lower(hotel_name)=lower('"+hotelName+"')";
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql))
		{
			LOGGER.debug(sql);
			while (rs.next()) {
				String hotelname = rs.getString( ACTION_1);
				String location1 = rs.getString(ACTION_2 );
				float rating1 = rs.getFloat(ACTION_3 );
				String Status = rs.getString(ACTION_4);
				int hotelId = rs.getInt("hotel_id");
				String roomtype = rs.getString("RoomType");
				String pic=rs.getString("pic");
				
				HotelName n=new HotelName();
				n.setHotelName(hotelname);
				n.setLocation(location1);
				n.setRating(rating1);
				n.setStatus(Status);
				n.setHotelId(hotelId);
				n.setRoomType(roomtype);
				n.setPic(pic);
				list.add(n);

			}

		} catch (Exception e) {
			LOGGER.debug(e);
		}

		return list;
	}

	
	
	

	public List<HotelName> getHotelByRating(float rating) 
	{
		List<HotelName> list = new ArrayList<HotelName>();
		String sql = "select * from hotel where rating=" + rating + "";
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				String hotelname = rs.getString( ACTION_1);
				String location1 = rs.getString(ACTION_2 );
				float rating1 = rs.getFloat(ACTION_3 );
				String Status = rs.getString(ACTION_4);
				int hotelId = rs.getInt("hotel_id");
				String roomtype = rs.getString("RoomType");
				String pic=rs.getString("pic");
				
				HotelName n=new HotelName();
				n.setHotelName(hotelname);
				n.setLocation(location1);
				n.setRating(rating1);
				n.setStatus(Status);
				n.setHotelId(hotelId);
				n.setRoomType(roomtype);
				n.setPic(pic);
				list.add(n);
			}

		} catch (Exception e) {
			LOGGER.debug(e);
		}
		return list;

	}
	//

	public List<HotelName> getHotelByLocation(String location)
	{
		List<HotelName> list = new ArrayList<HotelName>();
		String sql = "select *from hotel  where lower(location)=lower('" + location + "')";
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				String hotelname = rs.getString( ACTION_1);
				String location1 = rs.getString(ACTION_2 );
				float rating1 = rs.getFloat(ACTION_3 );
				String Status = rs.getString(ACTION_4);
				int hotelId = rs.getInt("hotel_id");
				String roomtype = rs.getString("RoomType");
				String pic=rs.getString("pic");
				
				HotelName n=new HotelName();
				n.setHotelName(hotelname);
				n.setLocation(location1);
				n.setRating(rating1);
				n.setStatus(Status);
				n.setHotelId(hotelId);
				n.setRoomType(roomtype);
				n.setPic(pic);
				list.add(n);

			}
		} catch (Exception e) {
			LOGGER.debug(e);
		}
		return list;
	}

	public List<HotelName>getBookingDetails(int hotel) 
	{
		List<HotelName> list = new ArrayList<HotelName>();

		String sql = "select c.hotel_name,r.userid,r.members,r.room_type,r.bed_type,r.check_in,r.check_out,r.payment from hotel c  inner join room r on c.hotel_id=r.hotel where hotel_id="+ hotel;
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql)) {
			LOGGER.debug(sql);
			while (rs.next()) {
				String hotelname2 = rs.getString( ACTION_1);
				int Member = rs.getInt("members");
				String Room = rs.getString("room_type");
				String BedType = rs.getString("bed_type");
				String InDate = rs.getString("check_in");
				String OutDate = rs.getString("check_out");
				String Payment = rs.getString("payment");
				HotelName n=new HotelName();
				n.setHotelName(hotelname2);
			    n.setMember(Member);
			    n.setRoom(Room);
			    n.setBedType(BedType);
			    n.setInDate(InDate);
			    n.setOutDate(OutDate);
			    n.setPayment(Payment);
				list.add(n);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
		}
		return list;
	}

	public void hotel(HotelName c) 
	{
		String sql = "insert into hotel(hotel_id,hotel_name,location,rating,status,RoomType,pic)values(?,?,?,?,?,?,?)";
		try (Connection con = ConnectionUtil.getConnect();PreparedStatement ps = con.prepareStatement(sql)) 
		{
			ps.setInt(1, c.getHotelId());
			ps.setString(2, c.getHotelName());
			ps.setString(3, c.getLocation());
			ps.setFloat(4, c.getRating());
			ps.setString(5, c.getStatus());
			ps.setString(6, c.getRoomType());
			ps.setString(7, c.getPic());

			int rows = ps.executeUpdate();
			LOGGER.debug("No of rows inserted :" + rows);
		} catch (Exception e) {
			LOGGER.debug(e);
		}

	}

	public void updatetable(int hotelId,String status) {
		try (Connection con = ConnectionUtil.getConnect(); Statement stmt = con.createStatement()) {
			String sql = "update hotel set status='"+status+"' where hotel_id=" + hotelId;
			LOGGER.debug(sql);
			int rows = stmt.executeUpdate(sql);
			LOGGER.debug("No of rows updated :" + rows);
		} catch (Exception e) {
			LOGGER.debug(e);
		}

	}
}