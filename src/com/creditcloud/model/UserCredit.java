package com.creditcloud.model;

import java.io.Serializable;

/**
 * 用户信用记录
 * @author mengxc
 *
 */
public class UserCredit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6445731851328682678L;

	/**
	 * 用户ID
	 */
	public String userId;
	
	/**
	 * 信用等级
	 */
	public String creditRank;
	
	/**
	 * 信用评分
	 */
	public Assessment assessment;
	
	/**
	 * 信用额度
	 */
	public double creditLimit;
	
	/**
	 * 可用额度
	 */
	public double creditAvailable;
	
	public String lastModifiedBy;
	
	public long timeCreated;
	
	public long timeLastUpdated;
	
}
