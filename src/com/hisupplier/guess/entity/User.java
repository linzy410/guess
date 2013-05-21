/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.entity;

import java.io.Serializable;

import com.hisupplier.guess.util.IConstants;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public class User implements Serializable {

	private static final long serialVersionUID = -5323453439042052430L;

	private int id;
	private String headImg;
	private int loginState; // 0=未登录 1=登录 
	private String name;
	private int identity; // 0=未知 1=平民  2=卧底
	private int gameState = IConstants.GAME_STATE_WAITING; // 0=游戏等待 1=游戏准备 2=游戏中 3=游戏结束
	private String word; // 词
	private Guess guess = new Guess();
	
	public String getHeadImg() {
		return headImg;
	}
	
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public int getIdentity() {
		return identity;
	}

	public void setGameState(int gameState) {
		this.gameState = gameState;
	}

	public int getGameState() {
		return gameState;
	}

	public void setLoginState(int loginState) {
		this.loginState = loginState;
	}

	public int getLoginState() {
		return loginState;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setGuess(Guess guess) {
		this.guess = guess;
	}

	public Guess getGuess() {
		return guess;
	}
}
