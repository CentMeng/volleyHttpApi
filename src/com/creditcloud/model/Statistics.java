package com.creditcloud.model;

import java.io.Serializable;

/**
 * 用户相关统计信息
 * @author mengxc
 *
 */
public class Statistics implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6811298477490151807L;
	
	/**
	 * 用户ID
	 */
	public String userId;
	
	/**
	 * 已发布的借款数
	 */
	public int publishedLoans;
	
	/**
	 * 已结算的借款数
	 */
	public int settledLoans;
	
	/**
	 * 已还清的借款数
	 */
	public int clearedLoans;
	
	/**
	 * 已逾期的借款数
	 */
	public int overdueLoans;
	
	/**
	 * 已违约的借款数
	 */
	public int breachLoans;
	
	/**
	 * 用户借款总数
	 */
	public double totalLoanAmount;
	
	/**
	 * 用户借款总额
	 */
	public Amount dueLoanAmount;
	
	/**
     * 用户逾期金额
     */
	public Amount overdueLoanAmount;
	
	/**
	 * 用户投资金额
	 */
	public Amount dueInvestAmount;
	
	/**
	 * 用户投资总额
	 */
	public double totalInvestAmount;

	@Deprecated
	public int successfulLoans;
	
}
