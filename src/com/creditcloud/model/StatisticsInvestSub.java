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
	private String userId;
	
	/**
	 * 投资标的已投标数
	 */
	private long biddedInvests;
	
	/**
	 * 投资标的已结算数
	 */
	private long settledInvests;
	
	/**
	 * 投资标的已还清数
	 */
	private long clearedInvests;
	
	/**
	 * 投资标的已逾期数
	 */
	private long overdueInvests;
	
	/**
	 * 投资标的已违约数
	 */
	private long breachInvests;
	
	/**
	 * 总金额
	 */
	private double totalAmount;

	/**
	 * 已回收金额
	 */
	private Amount dueAmount;
	
	/**
	 * 待回收金额
	 */
	private Amount overdueAmount;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getBiddedInvests() {
		return biddedInvests;
	}

	public void setBiddedInvests(long biddedInvests) {
		this.biddedInvests = biddedInvests;
	}

	public long getSettledInvests() {
		return settledInvests;
	}

	public void setSettledInvests(long settledInvests) {
		this.settledInvests = settledInvests;
	}

	public long getClearedInvests() {
		return clearedInvests;
	}

	public void setClearedInvests(long clearedInvests) {
		this.clearedInvests = clearedInvests;
	}

	public long getOverdueInvests() {
		return overdueInvests;
	}

	public void setOverdueInvests(long overdueInvests) {
		this.overdueInvests = overdueInvests;
	}

	public long getBreachInvests() {
		return breachInvests;
	}

	public void setBreachInvests(long breachInvests) {
		this.breachInvests = breachInvests;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Amount getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(Amount dueAmount) {
		this.dueAmount = dueAmount;
	}

	public Amount getOverdueAmount() {
		return overdueAmount;
	}

	public void setOverdueAmount(Amount overdueAmount) {
		this.overdueAmount = overdueAmount;
	}
	
	
	
}
