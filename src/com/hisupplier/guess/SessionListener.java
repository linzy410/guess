/* 
 * Created by linzheyan at 2013-1-31 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.hisupplier.guess.dao.SessionDao;
import com.hisupplier.guess.entity.User;
import com.hisupplier.guess.game.GuessMain;
import com.hisupplier.guess.util.Global;
import com.hisupplier.guess.util.JdbcUtil;

/**
 * @author linzheyan
 *
 * 2013-1-31
 */
public class SessionListener implements HttpSessionListener {
	
	private SessionDao sessionDao = (SessionDao) Global.getContext().getBean("sessionDao");

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent arg0) {
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent event) {
		Connection conn = null;
		try {
			User user = (User) event.getSession().getAttribute("user");
			if (user == null) {
				System.out.println("这是个嘛事情啊");
			} else {
				GuessMain.removeLoginUser(user);
				conn = JdbcUtil.getConnection();
				sessionDao.remove(conn, user.getId());
				System.out.println(user.getId() + "session过期");
				conn.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.closeConnection(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
