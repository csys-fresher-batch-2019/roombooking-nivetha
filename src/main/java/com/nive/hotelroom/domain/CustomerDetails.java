package com.nive.hotelroom.domain;
public class CustomerDetails {
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
	public String toString2() {
		return "Customer [ userName=" + userName + ", mobNo=" + mobNo + ", city=" + city
				+ ", emailId=" + emailId + ", payment=" + payment + "]";
	}


}
