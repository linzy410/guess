/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.game;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.hisupplier.guess.dao.SessionDao;
import com.hisupplier.guess.dao.UserDao;
import com.hisupplier.guess.dao.WordsDao;
import com.hisupplier.guess.entity.Guess;
import com.hisupplier.guess.entity.User;
import com.hisupplier.guess.entity.Words;
import com.hisupplier.guess.util.Global;
import com.hisupplier.guess.util.IConstants;
import com.hisupplier.guess.util.JdbcUtil;
import com.hisupplier.guess.util.SessionUtil;
import com.hisupplier.guess.util.VoteComparator;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public class GuessMain {

	private static UserDao userDao = (UserDao) Global.getContext().getBean("userDao");
	private static WordsDao wordsDao = (WordsDao) Global.getContext().getBean("wordsDao");
	private static SessionDao sessionDao = (SessionDao) Global.getContext().getBean("sessionDao");

	private static List<User> users; // �����û�
	private static List<User> loginUsers = new ArrayList<User>(); // ��¼�û�
	private static int gameState = IConstants.GAME_STATE_WAITING;
	private static Words words = null;
	private static int round; // �ִ�
	private static int turn = 0; // �����ʵ���Ա˳��
	private static int guessState = -1; // ���Ե׻���
	private static int liveUserCount = 0; // û����̭����Ϸ����

	public static void init() throws SQLException {
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();
			users = userDao.getUserList(conn);
			sessionDao.clear(conn);
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeConnection(conn);
		}
	}

	public static List<User> getUsers() {
		return users;
	}

	/**
	 * ��ӵ�¼�û�
	 * @param user
	 */
	public static void addLoginUser(User user) {
		loginUsers.add(user);
	}

	/**
	 * �û���Ϸ׼��
	 * @param userId
	 */
	public static void userReady(int userId) {
		gameState = IConstants.GAME_STATE_WAITING;
		User u = getUserById(userId);
		userReady(u);
	}

	/**
	 * ��֤�Ƿ����е�¼�û�����׼��
	 */
	private static boolean checkAllUserReady() {
		for (User user : loginUsers) {
			if (user.getGameState() != IConstants.GAME_STATE_READY) {
				return false;
			}
		}
		return true;
	}

	/**
	 * ��ѯ���е�¼�û�
	 * @return
	 */
	public static List<User> getLoginUsers() {
		if (gameState == IConstants.GAME_STATE_DOING) {
			// ÿ�����������Ĵ�
			if (turn < loginUsers.size()) {
				guessState = IConstants.GUESS_SPEAK;
				User u = loginUsers.get(turn);
				if (u.getGameState() == IConstants.GAME_STATE_OVER) {
					turn++;
				} else {
					Guess g = u.getGuess();
					if (g.getState() == IConstants.GUESS_SPEAK_UNALLOW) {
						g.setState(IConstants.GUESS_SPEAK_ALLOW);
						g.setStartTime(Calendar.getInstance().getTime().getTime());
					} else {
						if (g.getTime() > IConstants.SPEAK_TIME) { //����30�룬���Խ���
							g.setState(IConstants.GUESS_SPEAK_UNALLOW);
							g.setDescription("");
							turn++;
						}
					}
				}
			} else { // ͶƱ���ڣ���ͶƱ�������潫turn���ã�ֻ����һ��
				if (guessState == IConstants.GUESS_SPEAK)
					guessState = IConstants.GUESS_VOTE;
			}
		}
		return loginUsers;
	}

	/**
	 * ��ʼ��Ϸ��ȡ�ʣ���������
	 * @throws SQLException 
	 */
	public static void startGame() throws SQLException {
		gameState = IConstants.GAME_STATE_DOING;
		liveUserCount = loginUsers.size();
		round = 1;
		int undercover = new Random().nextInt(loginUsers.size());
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();
			words = wordsDao.getWords(conn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeConnection(conn);
		}
		int i = 0;
		for (User user : loginUsers) {
			user.setGameState(IConstants.GAME_STATE_DOING);
			user.setGuess(new Guess());
			if (i == undercover) {
				user.setIdentity(IConstants.IDENTITY_UNDERCOVER);
				user.setWord(words.getSpecialWord());
			} else {
				user.setIdentity(IConstants.IDENTITY_PEOPLE);
				user.setWord(words.getNormalWord());
			}
			i++;
		}
	}

	/**
	 * 
	 * @param description
	 */
	public static boolean speak(int userId, String description) {
		User user = getUserById(userId);
		if (user.getGuess().getState() == IConstants.GUESS_SPEAK_ALLOW) {
			user.getGuess().setDescription(description);
			user.getGuess().setState(IConstants.GUESS_SPEAK_UNALLOW);
			turn++;
			return true;
		}
		return false;
	}

	public static List<String> getAllDesc() {
		List<String> list = new ArrayList<String>();
		for (User u : loginUsers) {
			if (StringUtils.isNotEmpty(u.getGuess().getDescription()))
				list.add(u.getName() + ": " + u.getGuess().getDescription());
		}
		return list;
	}

	/**
	 * ͶƱ
	 * 	�����û�ͶƱ�����ˣ����㱻��̭���û�
	 * @param userId  ��ͶƱ���û�
	 */
	public static String vote(int userId, HttpServletRequest request) {
		User sessionUser = SessionUtil.getSessionUser(request);
		User voteUser = getUserById(sessionUser.getId()); // ͶƱ���
		if (voteUser.getGameState() == IConstants.GAME_STATE_OVER) {
			return "dieVoteErr";
		} else if (voteUser.getGuess().getVoteState() == IConstants.VOTE_DONE) {
			return "voteMore";
		} else {
			User targetUser = getUserById(userId); // ��ͶƱ�û�
			targetUser.getGuess().getVoteUser().add(sessionUser.getName());
			voteUser.getGuess().setVoteState(IConstants.VOTE_DONE);
			if (checkAllUserVoted()) { // ���������û���ͶƱ�����㱻��̭���
				List<User> temp = new ArrayList<User>(loginUsers);
				Comparator<User> ascComparator = new VoteComparator();
				Collections.sort(temp, ascComparator);
				int killedUserId = temp.get(temp.size() - 1).getId();
				User killedUser = getUserById(killedUserId);
				killedUser.setGameState(IConstants.GAME_STATE_OVER);
				liveUserCount--;
				// �Ե���̭, ��Ϸ����
				if (killedUser.getIdentity() == IConstants.IDENTITY_UNDERCOVER) {
					killedUser.getGuess().setOverState(IConstants.GAME_OVER_STATE_UNDERCOVER_LOSE);
					gameOver(true);
				} else {
					killedUser.getGuess().setOverState(IConstants.GAME_OVER_STATE_PEOPLE_DIE);
					if (liveUserCount <= IConstants.GAME_OVER_MIN_USER) {
						gameOver(false);
					} else {
						// ������һ��
						guessState = IConstants.GUESS_SPEAK;
						for (User u : loginUsers) {
							Guess g = u.getGuess();
							g.setVoteState(IConstants.VOTE_NOT);
							g.getVoteUser().clear();
						}
						turn = 0;
						round++;
					}
				}
			}
			return "succ";
		}
	}

	/**
	 * ��Ϸ������������
	 * @param underCoverDie �Ե��Ƿ���̭
	 */
	private static void gameOver(boolean underCoverDie) {
		round = 0;
		gameState = IConstants.GAME_STATE_OVER;
		turn = 0;
		Guess guess = null;
		for (User u : loginUsers) {
			u.setGameState(IConstants.GAME_STATE_OVER);
			guess = u.getGuess();
			guess.setState(IConstants.GUESS_SPEAK_UNALLOW);
			guess.setVoteState(IConstants.VOTE_NOT);
			guess.setStartTime(0);
			if (guess.getOverState() == 0) {
				if (underCoverDie) {
					if (u.getIdentity() == IConstants.IDENTITY_PEOPLE) {
						guess.setOverState(IConstants.GAME_OVER_STATE_PEOPLE_WIN);
					}
				} else {
					if (u.getIdentity() == IConstants.IDENTITY_PEOPLE) {
						guess.setOverState(IConstants.GAME_OVER_STATE_PEOPLE_LOSE);
					} else {
						guess.setOverState(IConstants.GAME_OVER_STATE_UNDERCOVER_WIN);
					}
				}
			}
		}
	}

	/**
	 * �жϱ��غ��Ƿ����е��û�����ͶƱ
	 */
	private static boolean checkAllUserVoted() {
		for (User user : loginUsers) {
			if (user.getGameState() == IConstants.GAME_STATE_DOING && user.getGuess().getVoteState() == IConstants.VOTE_NOT)
				return false;
		}
		return true;
	}
	
	/**
	 * �Ƴ�����û�
	 * @param user
	 */
	public static void removeLoginUser(User user) {
		loginUsers.remove(user);
		liveUserCount--;
	}

	private static User getUserById(int userId) {
		for (User user : loginUsers) {
			if (user.getId() == userId) {
				return user;
			}
		}
		return null;
	}

	public static int getGameState() {
		if (gameState == IConstants.GAME_STATE_WAITING && checkAllUserReady() && loginUsers.size() >= 3) {
			gameState = IConstants.GAME_STATE_READY;
		}
		return gameState;
	}

	public static Words getWords() {
		return words;
	}

	public static int getRound() {
		return round;
	}

	public static int getGuessState() {
		return guessState;
	}

	public static void stopGame() {
		gameState = IConstants.GAME_STATE_WAITING;
		guessState = IConstants.GUESS_SPEAK;
		turn = 0;
		for (User user : loginUsers) {
			userReady(user);
		}
	}

	/**
	 * �û�׼�� ��ʼ�����״̬
	 * @param user
	 */
	private static void userReady(User user) {
		user.setGameState(IConstants.GAME_STATE_READY);
		user.getGuess().setState(IConstants.GUESS_SPEAK_UNALLOW);
		user.getGuess().getVoteUser().clear();
		user.getGuess().setVoteState(IConstants.VOTE_NOT);
		user.getGuess().setStartTime(0);
	}
}
