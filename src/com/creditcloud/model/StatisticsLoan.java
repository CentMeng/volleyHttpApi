package com.creditcloud.model;

/**
 * 用户借款统计信息
 * 
 * @author mengxc
 *
 */
public class StatisticsLoan {

    /**
     * 待审批贷款数
     */
	public long pendingLoanNum;
	
	/**
	 * 累计贷款总数
	 */
	public long totalLoanNum;
	
	/**
	 * 正在审批的借款总金额
	 */
	public long pendingLoanRequestAmount;
	
	/**
	 * 已逾期贷款数
	 */
	public long overdueLoanNum;
	
	/**
	 * 已还清贷款数
	 */
	public long clearedLoanNum;
	
	/**
	 * 已结算贷款数
	 */
	public long settledLoanNum;
	
	/**
	 * 累计贷款总额
	 */
	public long totalLoanAmount;
	
	/**
	 * 现有贷款总额：已安排、开放投标、已满标、已结算
	 */
	public long currentLoanAmount;
	
}
