/* 
 * Created by linzheyan at 2012-7-27 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.util;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Properties文件辅助工具类
 * @author linzheyan
 *
 * 2012-7-27
 */
public class PropertiesUtil {

	private Properties props;
	private final static String FILE_PATH = "app.properties";
	private Log log = LogFactory.getLog(PropertiesUtil.class);
	
	public PropertiesUtil() {
		loadProperties(FILE_PATH);
	}
	
	public PropertiesUtil(String filePath) {
		loadProperties(filePath);
	}

	private void loadProperties(String filePath) {
		InputStream in = null;
		try {
			in = new FileInputStream(this.getClass().getResource("/").getPath() + FILE_PATH);
			props = new Properties();
			props.load(in);
		} catch (Exception e) {
			log.error("加载" + filePath + "文件出错，" + e.getMessage(), e);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public String getValue(String key) {
		if (key == null || key.length() == 0)
			return null;
		return props.getProperty(key);
	}
	
	public Integer getIntValue(String key) {
		String val = getValue(key);
		try {
			return Integer.valueOf(val);
		} catch (Exception e) {
		}
		return null;
	}

	/**
	 * 修改值，并不保存
	 * @param key
	 * @param value
	 */
	public void setValue(String key, String value) {
		props.setProperty(key, value);
	}
	
	/**
	 * 修改并保存文件
	 * @param key
	 * @param value
	 */
	public void setValueWithSave(String key, String value) {
		setValue(key, value);
		saveFile();
	}

	public void saveFile() {
		OutputStream fos = null;
		try {
			fos = new FileOutputStream(this.getClass().getResource("/").getPath() + FILE_PATH);
			props.store(fos, null);
			fos.flush();
		} catch (Exception e) {
			log.error("保存Properties文件出错：" + e.getMessage());
		} finally {
			if (fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	public void remove(String key) {
		props.remove(key);
		saveFile();
	}
}
