package com.creditcloud.model;

import java.io.Serializable;

/**
 * 相关投资记录的订单信息
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-20 下午6:44:48
 * 
 */
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8413763192163591257L;

	
	public String projectTitle;
	
	public FundingInvestInfo order;
	
	public FundingReward reward;
	
}
