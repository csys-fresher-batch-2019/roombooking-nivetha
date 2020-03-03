package com.nive.hotelroom.domain;
public class HotelName {
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
	
	@Override
	public String toString() {
		return "HotelName [hotelId=" + hotelId + ", hotelName=" + hotelName + ", location=" + location + ", rating="
				+ rating + ", status=" + status + ", roomType=" + roomType + ", bedType=" + bedType + ", member="
				+ member + ", room=" + room + ", inDate=" + inDate + ", outDate=" + outDate + ", payment=" + payment
				+ ", pic=" + pic + "]";
	}
	
	

}
