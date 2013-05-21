package com.hisupplier.guess.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author <a href="mailto:linzheyan@viewlinecn.com">������</a> 
 * created in 2008-7-24
 */
public class CookieUtil {
//	private Log log = LogFactory.getLog(CookieUtil.class);
	
	private static final String COOKIE_ROOT_PATH = "/";
	
	/**
	 * ����Cookie
	 * @param request
	 * @param response
	 * @param key   	key
	 * @param value		ֵ
	 * @param expiry    ��Чʱ��
	 * @param path		·��
	 * @param domain	
	 */
	private static void setCookie(HttpServletRequest request, HttpServletResponse response, String key, String value, int expiry, String path, String domain){
		Cookie cookie = new Cookie(key, value);
		cookie.setMaxAge(expiry);
		if(path != null)
			cookie.setPath(path);
		if(domain != null)
			cookie.setDomain(domain);
		response.addCookie(cookie);
	}
	
	/**
	 * ����Cookie
	 * @param request
	 * @param response
	 * @param key
	 * @param value
	 */
	public static void setCookie(HttpServletRequest request, HttpServletResponse response, String key, String value){
		setCookie(request, response, key, value, -1, getPath(request), null);
	}
	
	/**
	 * ��ȡCookie
	 * @param request
	 * @param key
	 * @return cookie
	 */
	private static Cookie getCookie(HttpServletRequest request, String key){
		Cookie[] cookies = request.getCookies();
		if(cookies == null|| key == null || key.length() == 0)
			return null;
		for (int i = 0; i < cookies.length; i++) {
			if(cookies[i].getName().equals(key))
				return cookies[i];
		}
		return null;
	}
	
	/**
	 * ��ȡcookieֵ
	 * @param request
	 * @param key
	 * @return  cookieֵ
	 */
	public static String getCookieValue(HttpServletRequest request, String key){
		Cookie cookie = getCookie(request, key);
		return cookie != null ? cookie.getValue() : null;
	}
	
	/**
	 * ɾ��Cookie
	 * @param request
	 * @param response
	 * @param key
	 */
	public static void deleteCookie(HttpServletRequest request, HttpServletResponse response, String key){
		Cookie cookie = getCookie(request, key);
		if(cookie != null){
			cookie.setMaxAge(0);
			cookie.setPath(getPath(request));
			response.addCookie(cookie);
		}
	}
	
	/**
	 * ȡ·��
	 */
	private static String getPath(HttpServletRequest request) {
	     String path = request.getContextPath();
	    return (path == null || path.length()==0) ? COOKIE_ROOT_PATH : path;
	   }

}
