package com.creditcloud.model;

import java.io.Serializable;

/**
 * 用户资金相关信息
 * 
 * @author mengxc
 *
 */
public class UserFund implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6978791854089292253L;
	
	/**
	 * 用户ID
	 */
	private String userId;
	
	/**
	 * 可用余额
	 */
	private double availableAmount;
	
	/**
	 * 冻结金额
	 */
	private double frozenAmount;
	
	/**
	 * 待收总额
	 */
	private double dueInAmount;
	
	/**
	 * 待还总额
	 */
	private double dueOutAmount;
	
	/**
	 * 充值总额
	 */
	private double depositAmount;
	
	/**
	 * 提现总额
	 */
	private double withdrawAmount;
	
	/**
	 * 商户给用户的转账收入或者用户给商户的转账支出<p>
     * 可能小于零
	 */
	private double transferAmount;
	
//	@Deprecated
	private double rechargeAmount;
	
	private double outstandingPrincipal;
	
	private double outstandingInterest;
	
	private double totalInvest;
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(double availableAmount) {
		this.availableAmount = availableAmount;
	}

	public double getFrozenAmount() {
		return frozenAmount;
	}

	public void setFrozenAmount(double frozenAmount) {
		this.frozenAmount = frozenAmount;
	}

	public double getDueInAmount() {
		return dueInAmount;
	}

	public void setDueInAmount(double dueInAmount) {
		this.dueInAmount = dueInAmount;
	}

	public double getDueOutAmount() {
		return dueOutAmount;
	}

	public void setDueOutAmount(double dueOutAmount) {
		this.dueOutAmount = dueOutAmount;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public double getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public double getOutstandingPrincipal() {
		return outstandingPrincipal;
	}

	public void setOutstandingPrincipal(double outstandingPrincipal) {
		this.outstandingPrincipal = outstandingPrincipal;
	}

	public double getOutstandingInterest() {
		return outstandingInterest;
	}

	public void setOutstandingInterest(double outstandingInterest) {
		this.outstandingInterest = outstandingInterest;
	}

	public double getTotalInvest() {
		return totalInvest;
	}

	public void setTotalInvest(double totalInvest) {
		this.totalInvest = totalInvest;
	}
	
	
	
}
