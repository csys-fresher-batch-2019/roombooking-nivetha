package com.nive.hotelroom.domain;

import java.sql.Date;

public class RoomType {
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
	public String toString1() {
		return "RoomType [ user="+user+", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}
	

}
