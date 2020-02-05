package com.onlineroom.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

		public static  Connection getConnect()throws Exception {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			//LOGGER.debug(con);
			//Statement stmt=con.createStatement();
			return con;
		}



}
