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
	private int loginState; // 0=δ��¼ 1=��¼ 
	private String name;
	private int identity; // 0=δ֪ 1=ƽ��  2=�Ե�
	private int gameState = IConstants.GAME_STATE_WAITING; // 0=��Ϸ�ȴ� 1=��Ϸ׼�� 2=��Ϸ�� 3=��Ϸ����
	private String word; // ��
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
