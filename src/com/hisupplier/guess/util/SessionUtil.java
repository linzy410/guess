/* 
 * Created by linzheyan at 2011-12-16 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hisupplier.guess.entity.User;

/**
 * @author linzheyan
 *
 * 2011-12-16
 */
public class SessionUtil {
	
	private static String KEY_USER_SESSION = "user";
	
	public static void setUserSession(User user) {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession(true);
		if (user != null) {
			session.setAttribute(KEY_USER_SESSION, user);
		}
	}
	
	public static User getSessionUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
        if (session == null) {
        	return null;	
        }
        return (User) session.getAttribute(KEY_USER_SESSION);
	}
}
