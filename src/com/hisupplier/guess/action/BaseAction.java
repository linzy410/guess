/* 
 * Created by linzheyan at 2013-1-30 
 * Copyright HiSupplier.com 
 */

package com.hisupplier.guess.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;


/**
 * @author linzheyan
 *
 * 2013-1-30
 */
public abstract class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1150716029152477077L;

	protected int selectedId;
	protected String JSON = "json";
	
	protected String getCurrentTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

	public void setSelectedId(int selectedId) {
		this.selectedId = selectedId;
	}

	public int getSelectedId() {
		return selectedId;
	}
}
