package com.nive.hotelroom.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.nive.hotelroom.dao.AdminDAO;
import com.nive.hotelroom.domain.AdminLogin;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.exception.ErrorConstant;
import com.nive.hotelroom.util.ConnectionUtil;
import com.nive.hotelroom.util.Logger;
public class AdminLoginImpl implements AdminDAO {
	private static Logger LOGGER = Logger.getInstance();
	public String login(AdminLogin al)throws DBException {
		String sql = "select username,password from login where username=? and password=?";
		try (Connection con = ConnectionUtil.getConnect();PreparedStatement pst=con.prepareStatement(sql))
		{
			LOGGER.debug(sql);
			pst.setString(1,al.getAdminName());
			pst.setString(2, al.getPassword());
			ResultSet rs=pst.executeQuery();
			String st=null;
			if (rs.next()) {
				st="success";
				String adminName1 = rs.getString("username");
				String Password = rs.getString("password");
				if (al.getAdminName().equals(adminName1) && al.getPassword().equals(Password)) 
				{
                    LOGGER.debug("Login Successfull");
					return st;
				} 
			}
			else 
			{
				st="failed";
				LOGGER.debug("Login failed");
				return st;
			}
		} 
		catch (Exception e) 
		{
			LOGGER.debug(e);
			throw new DBException(ErrorConstant.INVALID_SELECT);
		}
		return null;
	}
}