package com.creditcloud.model;

import java.io.Serializable;

/**
 * 
 * 众筹投资
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-11 下午2:55:22
 * 
 */
public class FundingInvest implements Serializable {

	public static final long serialVersionUID = 6057438575397939134L;

	/**
	 * 投资ID
	 */
	public String id;

	/**
	 * 众筹ID
	 */
	public String projectId;

	/**
	 * 众筹投资状态
	 */
	public String status;

	/**
	 * 投资金额
	 */
	public double amount;

	/**
	 * 回报ID
	 */
	public String rewardId;

	/**
	 * 用户ID
	 */
	public String userId;

	/**
	 * 
	 */
	public String message;

	
	public long submitTime;

	public String deliveryDetail;
	
}
