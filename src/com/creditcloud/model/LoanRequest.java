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
	
	private String productKey;
	
	

	public String getProductKey() {
		return productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getTimeSubmit() {
		return timeSubmit;
	}

	public void setTimeSubmit(Long timeSubmit) {
		this.timeSubmit = timeSubmit;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMortgageInfo() {
		return mortgageInfo;
	}

	public void setMortgageInfo(String mortgageInfo) {
		this.mortgageInfo = mortgageInfo;
	}

	public String getGuaranteeInfo() {
		return guaranteeInfo;
	}

	public void setGuaranteeInfo(String guaranteeInfo) {
		this.guaranteeInfo = guaranteeInfo;
	}

	public String getRiskInfo() {
		return riskInfo;
	}

	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

	public InvestRule getInvestRule() {
		return investRule;
	}

	public void setInvestRule(InvestRule investRule) {
		this.investRule = investRule;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Entity getGuaranteeEntity() {
		return guaranteeEntity;
	}

	public void setGuaranteeEntity(Entity guaranteeEntity) {
		this.guaranteeEntity = guaranteeEntity;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
