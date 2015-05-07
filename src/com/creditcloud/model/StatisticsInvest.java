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
	private long openStatusInvestNumber;
	
	/**
	 * 已投资的结算投标的标的数
	 */
	private long settledStatusInvestNumber;
	
	/**
	 * 已投资的收益金额
	 */
	private double investInterestAmount;
	
	/**
	 * 即使收益率
	 */
	private long currentYield;
	
	/**
	 * 投资冻结金额
	 */
	private double investFrozenAmount;
	
	private StatisticsInvestSub investStatistics;

	public long getOpenStatusInvestNumber() {
		return openStatusInvestNumber;
	}

	public void setOpenStatusInvestNumber(long openStatusInvestNumber) {
		this.openStatusInvestNumber = openStatusInvestNumber;
	}

	public long getSettledStatusInvestNumber() {
		return settledStatusInvestNumber;
	}

	public void setSettledStatusInvestNumber(long settledStatusInvestNumber) {
		this.settledStatusInvestNumber = settledStatusInvestNumber;
	}

	public double getInvestInterestAmount() {
		return investInterestAmount;
	}

	public void setInvestInterestAmount(double investInterestAmount) {
		this.investInterestAmount = investInterestAmount;
	}

	public long getCurrentYield() {
		return currentYield;
	}

	public void setCurrentYield(long currentYield) {
		this.currentYield = currentYield;
	}

	public double getInvestFrozenAmount() {
		return investFrozenAmount;
	}

	public void setInvestFrozenAmount(double investFrozenAmount) {
		this.investFrozenAmount = investFrozenAmount;
	}

	public StatisticsInvestSub getInvestStatistics() {
		return investStatistics;
	}

	public void setInvestStatistics(StatisticsInvestSub investStatistics) {
		this.investStatistics = investStatistics;
	}
	
	
}
