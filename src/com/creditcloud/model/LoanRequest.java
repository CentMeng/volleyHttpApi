package com.creditcloud.model;

import java.io.Serializable;

/**
 * 借款申请
 * 
 * Created by mengxc on 14-3-4.
 */
public class LoanRequest implements Serializable {
	private static final long serialVersionUID = 3880189518823894432L;
	
	/**
	 * 借款标的ID
	 */
	public String id;
	
	/**
	 * 借款标的名称
	 */
	public String title;
	
	/**
	 * 借款目的
	 */
	public String purpose;
	
	/**
	 * 借款期限
	 */
	public Duration duration;
	
	/**
	 * 年化利率
	 */
	public int rate;
	
	/**
	 * 还款方式
	 */
	public String method;
	
	/**
	 * 借款描述
	 */
	public String description;
	
	/**
	 * 提交时间
	 */
	public Long timeSubmit;
	
	/**
	 * 借款来源
	 */
	public String source;

	/**
	 * 抵押物信息
	 */
	public String mortgageInfo;

	/**
	 * 担保信息
	 */
	public String guaranteeInfo;

	/**
	 * 风险措施
	 */
	public String riskInfo;

	/**
	 * 投资规则
	 */
	public InvestRule investRule;

	/**
	 * 借款用户信息
	 */
	public User user;
	
	/**
	 * 借款用户ID
	 */
	public String userId;
	
	/**
	 * 借款金额
	 */
	public int amount;
	
	/**
	 * 保障实体
	 */
	public Entity guaranteeEntity;
	
	/**
	 * 借款编号
	 */
	public String serial;
}
