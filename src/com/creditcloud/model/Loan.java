package com.creditcloud.model;

import java.io.Serializable;

/**
 * 标的基本信息
 * 
 * @author mengxc
 *
 */
public class Loan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 725673078345496633L;

	/**
	 * 标的ID
	 */
	public String id;

	/**
	 * 标的编号
	 */
	public String serial;
	
	/**
	 * 标的名称
	 */
	public String title;
	
	/**
	 * 还款方式（见RepaymentMethod）
	 */
	public String method;
	
	/**
	 * 序号
	 */
	public String ordinal;
	
	/**
	 * 金额
	 */
	public double amount;
	
	/**
	 * 年化利率 （12.3% 取值为1230）
	 */
	public int rate;
	
	/**
	 * 标的期限
	 */
	public Duration duration;

	/**
	 * 借款申请
	 */
	public LoanRequest loanRequest;

	/**
	 * 开标时间
	 */
	public Long timeOpen;

	/**
	 * 满标时间
	 */
	public Long timeFinished;

	/**
	 * 还款完成时间
	 */
	public Long timeCleared;
	
	/**
	 * 结算时间
	 */
	public Long timeSettled;

	/**
	 * 有无抵押
	 */
	public boolean mortgaged;

	/**
	 * 当前已投标数
	 */
	public long bidNumber;

	/**
	 * 当前已投标金额
	 */
	public double bidAmount;
	
	/**
	 * 剩余金额
	 */
	public double available;
	
	/**
	 * 标的状态（见LoanStatus）
	 */
	public String status;

	/**
	 * 标的已投资金额
	 */
	public int investAmount;

	/**
	 * 标的投资比例（依此为基础计算其他已投资参数）
	 */
	public double investPercent;

	/**
	 * 待发布标的剩余时间（自行计算）
	 */
	@Deprecated
	public long timeLoss = -1;

	@Deprecated
	public long tickLoss = 0;

	@Deprecated
	public double balance;
	
	@Deprecated
	public long leftBidTime = 0;
	
	@Deprecated
	public long timeLeft = 0;
	
	@Deprecated
	public long countDownTime = 0;
	
	@Deprecated
	public long deviation = 0;
	
	/**
	 * 筹款周期（单位小时）
	 */
	public long timeout;
	
	/**
	 * 借款企业名称
	 */
	public String corporationName;
	
	/**
	 * 借款企业简称
	 */
	public String corporationShortName;
	
	/**
	 * 借款风险评级
	 */
	public String riskGrade;
	
	/**
	 * 标的位置信息
	 */
	public String location;
	
	/**
	 * 借款企业类型
	 */
	public String industry;
	
	/**
	 * 借款合同编号
	 */
	public String contractCode;
	
}
