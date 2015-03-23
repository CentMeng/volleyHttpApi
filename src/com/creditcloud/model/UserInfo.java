package com.creditcloud.model;

import java.io.Serializable;

/**
 * 用户信息
 * @author mengxc
 *
 */
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7370113152294461415L;

	/**
	 * 用户
	 */
	public User user;
	
	/**
	 * 个人信息
	 */
	public PersonInfo personal;
	
	/**
	 * 用户经济状况
	 */
	public UserFinance finance;
	
}
