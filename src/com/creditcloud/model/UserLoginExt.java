package com.creditcloud.model;

import java.io.Serializable;

/** 
 * 
 * 登录信息
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 2014-10-6 上午11:46:44 
 * 
 */
public class UserLoginExt implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9023281891370149707L;
	
	/**
	 * access token
	 */
	public String access_token;
	
	/**
	 * 用户信息
	 */
	public User user;
	
	/**
	 * token 类型
	 */
	public String token_type;
	
	public UmpAccount umpAccount;
	
	public PaymentAccount pnrAccount;
	
	public UserLoginExt() {
		this.user = new User();
	}
	
	public void copy(UserLoginExt userLoginExt) {
		this.access_token = userLoginExt.access_token;
		this.user = userLoginExt.user;
		this.token_type = userLoginExt.token_type;
	}
}
