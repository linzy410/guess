/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.entity;

import java.io.Serializable;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public class SessionUser implements Serializable {

	private static final long serialVersionUID = -3583451235259631893L;

	private Long id;
	private Long userId;
	private String time;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

}
