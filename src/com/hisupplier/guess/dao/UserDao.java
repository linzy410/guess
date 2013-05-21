/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hisupplier.guess.entity.User;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public class UserDao {
	
	/**
	 * 未登录用户
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public List<User> getUnloginUserList(Connection conn) throws SQLException {
		String sql = "select u.id, u.name,u.headImg from User u left join SessionUser su on u.id=su.userId where su.userId is null order by id";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<User> users = new ArrayList<User>();
		while (rs.next()) {
			User user = createUser(rs, false);
			users.add(user);
		}
		return users;
	}

	/**
	 * 所有用户
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public List<User> getUserList(Connection conn) throws SQLException {
		String sql = "select u.id, u.name,u.headImg, case when userId is null then 0 else 1 end as loginState from User u left join SessionUser su on u.id=su.userId order by id";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<User> users = new ArrayList<User>();
		while (rs.next()) {
			User user = createUser(rs, true);
			users.add(user);
		}
		return users;
	}

	private User createUser(ResultSet rs, boolean loginState) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setHeadImg(rs.getString("headImg"));
		user.setName(rs.getString("name"));
		if (loginState)
			user.setLoginState(rs.getInt("loginState"));
		return user;
	}
	
	
//	public List<User> getLoginUserList(Connection conn) throws SQLException {
//		List<User> list = new ArrayList<User>();
//		String sql = "select u.id, u.headImg,u.name, 1 as loginState from SessionUser su left join User u on su.userId=u.id order by id";
//		PreparedStatement ps = conn.prepareStatement(sql);
//		ResultSet rs = ps.executeQuery();
//		while (rs.next()) {
//			User user = createUser(rs, true);
//			list.add(user);
//		}
//		return list;
//	}
	
	public User getUserById(Connection conn, int userId) throws SQLException {
		String sql = "select * from User where id=" + userId;
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		User user = null;
		while (rs.next()) {
			user = createUser(rs, false);
		}
		return user;
	}
}
