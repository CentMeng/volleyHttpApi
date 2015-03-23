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
	public String userId;
	
	/**
	 * 可用余额
	 */
	public double availableAmount;
	
	/**
	 * 冻结金额
	 */
	public double frozenAmount;
	
	/**
	 * 待收总额
	 */
	public double dueInAmount;
	
	/**
	 * 待还总额
	 */
	public double dueOutAmount;
	
	/**
	 * 充值总额
	 */
	public double depositAmount;
	
	/**
	 * 提现总额
	 */
	public double withdrawAmount;
	
	/**
	 * 商户给用户的转账收入或者用户给商户的转账支出<p>
     * 可能小于零
	 */
	public double transferAmount;
	
	@Deprecated
	public double rechargeAmount;
}
