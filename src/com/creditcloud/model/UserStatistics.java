package com.creditcloud.model;

/**
 * 用户统计信息
 * 
 * @author mengxc
 *
 */
public class UserStatistics {

    /**
     * 认证信息完善情况
     */
	public long certificateProgress;
	
	/**
	 * 用户借款信息统计
	 */
	public StatisticsLoan loan;
	
	/**
	 * 用户投资信息统计
	 */
	public StatisticsInvest invest;
	
}
