package com.bizideal.mn.entity;

import java.io.Serializable;

/**
 * @author liulq:
 * @data 2017年4月27日 下午9:11:33
 * @version 1.0
 */
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 3463436831909991478L;
	private String userName;
	private String password;

	public UserInfo() {
		super();
	}

	public UserInfo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", password=" + password + "]";
	}

}
