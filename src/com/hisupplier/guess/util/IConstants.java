/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.util;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public interface IConstants {
	
	public static int LOGIN_STATE_DO = 1; // 登录状态：已 登录
	public static int LOGIN_STATE_UNDO = 0;// 未登录
	
	/** 0=等待游戏 1=游戏准备 2=游戏进行中 3=游戏结束*/
	public static int GAME_STATE_WAITING = 0; 
	public static int GAME_STATE_READY = 1;
	public static int GAME_STATE_DOING = 2;
	public static int GAME_STATE_OVER = 3;
	
	/** 1=平民 2=卧底*/
	public static int IDENTITY_PEOPLE = 1;
	public static int IDENTITY_UNDERCOVER = 2;
	
	/** 0=不允许发言 1=允许发言 */
	public static int GUESS_SPEAK_ALLOW = 1;
	public static int GUESS_SPEAK_UNALLOW = 0;
	
	/** 0=发言环节 1=投票环节 */
	public static int GUESS_SPEAK = 0;
	public static int GUESS_VOTE = 1;
	
	/** 投票环节 0=未投出 1=已投出 */
	public static int VOTE_NOT = 0;
	public static int VOTE_DONE = 1;
	
	/** 每人的发言时间  单位为秒 */
	public static int SPEAK_TIME = 30*2*60;
	
	/** 卧底存在情况下，剩下多少人游戏结束*/
	public static int GAME_OVER_MIN_USER = 2;
	
	/** 游戏结束时状态 1=平民赢 2=平民冤死 3=平民输 4=卧底赢 5=卧底淘汰 */
	public static int GAME_OVER_STATE_PEOPLE_WIN = 1;
	public static int GAME_OVER_STATE_PEOPLE_DIE = 2;
	public static int GAME_OVER_STATE_PEOPLE_LOSE = 3;
	public static int GAME_OVER_STATE_UNDERCOVER_WIN = 4;
	public static int GAME_OVER_STATE_UNDERCOVER_LOSE = 5;
}