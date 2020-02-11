package com.onlineroom.roombooking;

import java.util.List;

import com.onlineroom.imp.HotelName;

public class HotelNameList {
	
	public static void main(String[] args) {
		HotelName c=new HotelName();
		List<HotelName> list = c.getHotelNameList();
		for (HotelName name : list) 
		{
			System.out.println(name.toString1());
		}
	
	}

}
