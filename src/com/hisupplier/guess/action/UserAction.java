/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.action;

import java.util.List;

import com.hisupplier.guess.entity.User;
import com.hisupplier.guess.service.UserService;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public class UserAction extends BaseAction {

	private static final long serialVersionUID = 904453221550175749L;
	private UserService userService;
	private List<User> users;

	public String list() throws Exception {
		users = userService.getAllUserList();
		return SUCCESS;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getUsers() {
		return users;
	}
}
