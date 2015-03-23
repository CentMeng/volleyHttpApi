package com.creditcloud.model;

/**
 * 用户投资统计信息
 * @author mengxc
 *
 */
public class StatisticsInvest {

    /**
     * 已投资的开放投标的标的数
     */
	public long openStatusInvestNumber;
	
	/**
	 * 已投资的结算投标的标的数
	 */
	public long settledStatusInvestNumber;
	
	/**
	 * 已投资的收益金额
	 */
	public double investInterestAmount;
	
	/**
	 * 即使收益率
	 */
	public long currentYield;
	
	/**
	 * 投资冻结金额
	 */
	public double investFrozenAmount;
	
	public StatisticsInvestSub investStatistics;
}
