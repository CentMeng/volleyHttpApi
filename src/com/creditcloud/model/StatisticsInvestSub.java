package com.creditcloud.model;

/**
 * 用户投资统计信息
 * @author mengxc
 *
 */
public class StatisticsInvestSub {

    /**
     * 用户ID
     */
	public String userId;
	
	/**
	 * 投资标的已投标数
	 */
	public long biddedInvests;
	
	/**
	 * 投资标的已结算数
	 */
	public long settledInvests;
	
	/**
	 * 投资标的已还清数
	 */
	public long clearedInvests;
	
	/**
	 * 投资标的已逾期数
	 */
	public long overdueInvests;
	
	/**
	 * 投资标的已违约数
	 */
	public long breachInvests;
	
	/**
	 * 总金额
	 */
	public double totalAmount;

	/**
	 * 已回收金额
	 */
	public Amount dueAmount;
	
	/**
	 * 待回收金额
	 */
	public Amount overdueAmount;
	
}
