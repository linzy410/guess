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
	
	public static int LOGIN_STATE_DO = 1; // ��¼״̬���� ��¼
	public static int LOGIN_STATE_UNDO = 0;// δ��¼
	
	/** 0=�ȴ���Ϸ 1=��Ϸ׼�� 2=��Ϸ������ 3=��Ϸ����*/
	public static int GAME_STATE_WAITING = 0; 
	public static int GAME_STATE_READY = 1;
	public static int GAME_STATE_DOING = 2;
	public static int GAME_STATE_OVER = 3;
	
	/** 1=ƽ�� 2=�Ե�*/
	public static int IDENTITY_PEOPLE = 1;
	public static int IDENTITY_UNDERCOVER = 2;
	
	/** 0=�������� 1=������ */
	public static int GUESS_SPEAK_ALLOW = 1;
	public static int GUESS_SPEAK_UNALLOW = 0;
	
	/** 0=���Ի��� 1=ͶƱ���� */
	public static int GUESS_SPEAK = 0;
	public static int GUESS_VOTE = 1;
	
	/** ͶƱ���� 0=δͶ�� 1=��Ͷ�� */
	public static int VOTE_NOT = 0;
	public static int VOTE_DONE = 1;
	
	/** ÿ�˵ķ���ʱ��  ��λΪ�� */
	public static int SPEAK_TIME = 30*2*60;
	
	/** �Ե״�������£�ʣ�¶�������Ϸ����*/
	public static int GAME_OVER_MIN_USER = 2;
	
	/** ��Ϸ����ʱ״̬ 1=ƽ��Ӯ 2=ƽ��ԩ�� 3=ƽ���� 4=�Ե�Ӯ 5=�Ե���̭ */
	public static int GAME_OVER_STATE_PEOPLE_WIN = 1;
	public static int GAME_OVER_STATE_PEOPLE_DIE = 2;
	public static int GAME_OVER_STATE_PEOPLE_LOSE = 3;
	public static int GAME_OVER_STATE_UNDERCOVER_WIN = 4;
	public static int GAME_OVER_STATE_UNDERCOVER_LOSE = 5;
}