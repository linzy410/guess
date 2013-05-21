/* 
 * Created by linzheyan at 2013-2-21 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.util;

import java.util.Comparator;

import com.hisupplier.guess.entity.User;


/**
 * @author linzheyan
 *
 * 2013-2-21
 */
public class VoteComparator implements Comparator<User> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(User u1, User u2) {
		return u1.getGuess().getVoteUser().size() - u2.getGuess().getVoteUser().size();
	}

}
