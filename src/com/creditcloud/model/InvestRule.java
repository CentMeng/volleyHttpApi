package com.creditcloud.model;

import java.io.Serializable;

/**
 * 
 * 投资规则
 * 
 * Created by mengxc on 14-3-4.
 */
public class InvestRule implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8565358422216590335L;
	
	/**
	 * 最新投资金额
	 */
	public int minAmount;
	
	/**
	 * 最大投资金额
	 */
	public int maxAmount;
	
	/**
	 * 递增金额
	 */
	public int stepAmount;
}
