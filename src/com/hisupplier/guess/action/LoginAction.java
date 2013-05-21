/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.action;

import org.apache.struts2.ServletActionContext;

import com.hisupplier.guess.service.UserService;

/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public class LoginAction extends BaseAction {

	private static final long serialVersionUID = 4720899462346788223L;
	private UserService userService;

	public String execute() throws Exception {
		userService.login(selectedId, super.getCurrentTime(), ServletActionContext.getRequest());
		return SUCCESS;
	}
	
	public String main() throws Exception {
		return "main";
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
