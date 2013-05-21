package com.hisupplier.guess.util;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 
 * @author linzheyan
 *
 * 2011-12-2
 */
public class Global {
   private static ApplicationContext _ctx = null; 
   private static String defaultContextPath = "classpath*:applicationContext.xml";
	public static void initContext(String contextPath) {
		_ctx =  new ClassPathXmlApplicationContext(defaultContextPath);
	}
	
	public static ApplicationContext getContext(){
		if(_ctx==null){
			initContext(defaultContextPath);
		}
		return _ctx;
	}
	
	public static ApplicationContext getContext(ServletContext sc){
		if(_ctx==null){
			_ctx=WebApplicationContextUtils.getWebApplicationContext(sc);
		}
		return _ctx;
	}
}
