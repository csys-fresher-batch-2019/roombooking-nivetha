package com.nive.hotelroom.domain;

public class AdminLogin {
	private String adminName;
	private String passWord;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword(String password) {
		this.passWord = password;
	}

	@Override
	public String toString() {
		return "AdminLogin [adminName=" + adminName + ", passWord=" + passWord + "]";
	}

}
