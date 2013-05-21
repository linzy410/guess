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
public class Words implements Serializable {

	private static final long serialVersionUID = 2510034799456551351L;

	private int id;
	private String normalWord;
	private String specialWord;
	private int state; // 0=未使用 1=已使用

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setState(int state) {
		this.state = state;
	}

	public int getState() {
		return state;
	}
}
