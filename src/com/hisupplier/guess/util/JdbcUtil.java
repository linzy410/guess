/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public class JdbcUtil {

	public synchronized static Connection getConnection() throws SQLException {
		Connection connect = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			PropertiesUtil prop = new PropertiesUtil();
			String url = prop.getValue("database.url");
			String user = prop.getValue("database.user");
			String password = prop.getValue("database.password");
			connect = DriverManager.getConnection(url, user, password);
			connect.setAutoCommit(false);
		} catch (SQLException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connect;
	}
	
	public static void closeConnection(Connection conn) throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}
}
