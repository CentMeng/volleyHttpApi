package com.creditcloud.model;

import java.io.Serializable;

/**
 * 
 * 众筹回报
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-9 上午11:06:36
 * 
 */
public class FundingReward implements Serializable {


	private static final long serialVersionUID = 4418090736755828697L;

	public String id;

	/**
	 * 众筹ID
	 */
	public String projectId;

	/**
	 * donate/invest/pledge amount
	 */
	public double amount;

	/**
	 * reward number limit
	 */
	public int limitNumber;

	/**
	 * number raised
	 */
	public int raiseNumber;

	/**
	 * return description
	 */
	public String description;

	/**
	 * delivery cost, area, time ...</p> can be json
	 */
	public String deliveryDetail;

	/**
	 * hard limit
	 */
	public boolean hardLimit;

	/**
	 * amount actual raised
	 */
	public double raiseAmount;

	public int leftNumber;
	
	//配送时间
	public String deliveryTime;
	
	public FundingReward(String id, String projectId, double amount,
			int limitNumber, String description,
			String deliveryDetail) {
		this.id = id;
		this.projectId = projectId;
		this.amount = amount;
		this.limitNumber = limitNumber;
		this.description = description;
		this.deliveryDetail = deliveryDetail;
	}

	/**
	 * left number
	 * 
	 * @return
	 */
	public int getLeftNumber() {
		int result = limitNumber - raiseNumber;
		return result < 0 ? 0 : result;
	}

}
