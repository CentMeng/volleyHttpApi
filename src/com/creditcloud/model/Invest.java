package com.creditcloud.model;

import java.io.Serializable;

/**
 * 
 * @author mengxc (mengxc.ma@creditcloud.com)
 *
 */
public class Invest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3663350754158368629L;

	public int amount;
	
	public String bidMethod;
	
	public Duration duration;
	
	public String id;
	
	public String loanId;
	
	public String loanTitle;
	
	public long rate;
	
	public String repayMethod;
	
	public String status;
	
	public long submitTime;
	
	public String userId;
	
	public String userLoginName;
	
	public String purpose;
	
	public String serial;

	public int originalAmount;
	
	public int loanAmount;

	/**
	 * 风险等级
	 */
	public String riskGrade;
	
}

