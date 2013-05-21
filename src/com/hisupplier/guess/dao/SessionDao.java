/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public class SessionDao {

	public void addSession(Connection conn, int userId, String createTime) throws SQLException {
		String sql = "insert into SessionUser (userId, time) value (?,?) ON DUPLICATE KEY UPDATE time=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setLong(1, userId);
		ps.setString(2, createTime);
		ps.setString(3, createTime);
		ps.execute();
	}
	
	public void remove(Connection conn, int userId) throws SQLException {
		String sql = "delete from SessionUser where userId=" + userId;
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
	}
	
	public void clear(Connection conn) throws SQLException {
		String sql = "truncate table SessionUser";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
	}
}
