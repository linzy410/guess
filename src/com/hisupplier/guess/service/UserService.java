/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hisupplier.guess.dao.SessionDao;
import com.hisupplier.guess.dao.UserDao;
import com.hisupplier.guess.entity.User;
import com.hisupplier.guess.game.GuessMain;
import com.hisupplier.guess.util.JdbcUtil;
import com.hisupplier.guess.util.SessionUtil;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public class UserService {
	
	private UserDao userDao;
	private SessionDao sessionDao;

	public void login(int userId, String createTime, HttpServletRequest request) throws SQLException {
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();
			User sessionUser = SessionUtil.getSessionUser(request);
			if (!(sessionUser != null && sessionUser.getId() == userId)) {
				sessionDao.addSession(conn, userId, createTime);
				User user = userDao.getUserById(conn, userId);
				SessionUtil.setUserSession(user);
				GuessMain.addLoginUser(user);
			}
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeConnection(conn);
		}
	}
	
	public List<User> getAllUserList() throws Exception {
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();
			return userDao.getUnloginUserList(conn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeConnection(conn);
		}
		return null;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setSessionDao(SessionDao sessionDao) {
		this.sessionDao = sessionDao;
	}
}
