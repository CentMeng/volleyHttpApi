package com.creditcloud.model;

import java.io.Serializable;

/**
 * 用户详情
 * 
 * @author mengxc
 *
 */
public class UserDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1865738800985957685L;

	/**
	 * 头像（base64编码）
	 */
	public String avadar;
	
	/**
	 * 用户信用记录
	 */
	public UserCredit userCredit;
	
	/**
	 * 用户资金统计
	 */
	public UserFund userFund;
	
	/**
	 * 用户信息
	 */
	public UserInfo userInfo;
	
	/**
	 * 用户基本信息
	 */
	public User user;
	
	/**
	 * 用户认证信息
	 */
	public Certificates certificates;
	
	/**
	 * 用户相关统计信息
	 */
	public Statistics statistics;
}
