/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public class Game implements Serializable{

	private static final long serialVersionUID = 899856625353158426L;

	private Long id;
	private List<User> users;
	private String normalWord;
	private String specialWord;
	private String createTime;
	private Integer state; //0=未开始  10=已开始 20=已结束
	private String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String getNormalWord() {
		return normalWord;
	}
	public void setNormalWord(String normalWord) {
		this.normalWord = normalWord;
	}
	public String getSpecialWord() {
		return specialWord;
	}
	public void setSpecialWord(String specialWord) {
		this.specialWord = specialWord;
	}
	public String getUserIds() {
		StringBuilder sb = new StringBuilder();
		for (User user : users) {
			sb.append(",").append(user.getId());
		}
		return sb.toString().substring(1);
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getState() {
		return state;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
}
