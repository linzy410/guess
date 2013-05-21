/* 
 * Created by linzheyan at 2013-2-19 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.hisupplier.guess.util.IConstants;


/**
 * @author linzheyan
 *
 * 2013-2-19
 */
public class Guess {

	private int state; // 0=不允许发言 1=允许发言
	private long startTime;
	private int voteState; // 0=无投票 1=开始投票
	private List<String> voteUser = new ArrayList<String>(); // 投票的用户
	private String description;
	private int overState; // 游戏结束时状态 1=平民赢 2=平民冤死 3=平民输 4=卧底赢 5=卧底淘汰
	
	/**
	 * 发言时间
	 * @return
	 */
	public int getTime() {
		if (startTime == 0)
			return 0;
		return (int) ((Calendar.getInstance().getTime().getTime() - startTime) / 1000);
	}
	
	public String getAllVoteUser() {
		StringBuilder sb = new StringBuilder();
		for (String name : voteUser) {
			sb.append(",").append(name);
		}
		if (sb.length() > 0)
			return sb.substring(1);
		return StringUtils.EMPTY;
	}
	
	public Guess() {
		state = IConstants.GUESS_SPEAK_UNALLOW;
	}
	
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getState() {
		return state;
	}

	public void setVoteState(int voteState) {
		this.voteState = voteState;
	}

	public int getVoteState() {
		return voteState;
	}

	public void setVoteUser(List<String> voteUser) {
		this.voteUser = voteUser;
	}

	public List<String> getVoteUser() {
		return voteUser;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setOverState(int overState) {
		this.overState = overState;
	}

	public int getOverState() {
		return overState;
	}
}
