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

	public long getPendingLoanNum() {
		return pendingLoanNum;
	}

	public void setPendingLoanNum(long pendingLoanNum) {
		this.pendingLoanNum = pendingLoanNum;
	}

	public long getTotalLoanNum() {
		return totalLoanNum;
	}

	public void setTotalLoanNum(long totalLoanNum) {
		this.totalLoanNum = totalLoanNum;
	}

	public long getPendingLoanRequestAmount() {
		return pendingLoanRequestAmount;
	}

	public void setPendingLoanRequestAmount(long pendingLoanRequestAmount) {
		this.pendingLoanRequestAmount = pendingLoanRequestAmount;
	}

	public long getOverdueLoanNum() {
		return overdueLoanNum;
	}

	public void setOverdueLoanNum(long overdueLoanNum) {
		this.overdueLoanNum = overdueLoanNum;
	}

	public long getClearedLoanNum() {
		return clearedLoanNum;
	}

	public void setClearedLoanNum(long clearedLoanNum) {
		this.clearedLoanNum = clearedLoanNum;
	}

	public long getSettledLoanNum() {
		return settledLoanNum;
	}

	public void setSettledLoanNum(long settledLoanNum) {
		this.settledLoanNum = settledLoanNum;
	}

	public long getTotalLoanAmount() {
		return totalLoanAmount;
	}

	public void setTotalLoanAmount(long totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}

	public long getCurrentLoanAmount() {
		return currentLoanAmount;
	}

	public void setCurrentLoanAmount(long currentLoanAmount) {
		this.currentLoanAmount = currentLoanAmount;
	}
	
	
	
}
