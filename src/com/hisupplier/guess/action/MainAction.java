/* 
 * Created by linzheyan at 2013-1-31 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.hisupplier.guess.entity.User;
import com.hisupplier.guess.entity.Words;
import com.hisupplier.guess.game.GuessMain;
import com.hisupplier.guess.util.SessionUtil;

/**
 * @author linzheyan
 *
 * 2013-1-31
 */
public class MainAction extends BaseAction {

	private static final long serialVersionUID = -5016929208473199866L;
	private List<User> loginUsers;
	private Words words;
	private Map<String, Object> map = new HashMap<String, Object>();
	private String desc;

	/**
	 * ��Ϸ״̬
	 */
	public String execute() throws Exception {
		loginUsers = GuessMain.getLoginUsers();
		words = GuessMain.getWords();
		map.put("round", GuessMain.getRound());
		map.put("gameState", GuessMain.getGameState());
		map.put("guessState", GuessMain.getGuessState());
		map.put("desc", GuessMain.getAllDesc());
		return JSON;
	}
	
	/**
	 * �û�׼��
	 * @return
	 * @throws Exception
	 */
	public String user_ready() throws Exception {
		GuessMain.userReady(SessionUtil.getSessionUser(ServletActionContext.getRequest()).getId());
		return null;
	}
	
	/**
	 * ��Ϸ��ʼ
	 * @return
	 * @throws Exception
	 */
	public String start_game() throws Exception {
		GuessMain.startGame();
		return null;
	}
	
	/**
	 * ֹͣ��Ϸ
	 * @return
	 * @throws Exception
	 */
	public String stop_game() throws Exception {
		GuessMain.stopGame();
		return null;
	}
	
	/**
	 * ����
	 * @return
	 * @throws Exception
	 */
	public String speak() throws Exception {
		boolean rsl = GuessMain.speak(SessionUtil.getSessionUser(ServletActionContext.getRequest()).getId(), desc);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.getWriter().print(rsl);
		return null;
	}
	
	/**
	 * ͶƱ
	 * @return
	 * @throws Exception
	 */
	public String vote() throws Exception {
		String rsl = GuessMain.vote(selectedId, ServletActionContext.getRequest());
		HttpServletResponse response = ServletActionContext.getResponse();
		response.getWriter().print(rsl);
		return null;
	}
	
	/**
	 * �����ʾ
	 * @return
	 * @throws Exception
	 */
	public String game_result() throws Exception {
		loginUsers = GuessMain.getLoginUsers();
		return "over";
	}

	public List<User> getLoginUsers() {
		return loginUsers;
	}

	public Words getWords() {
		return words;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
