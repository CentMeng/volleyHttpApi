package com.creditcloud.model;

import java.io.Serializable;

/**
 * 
 * 众筹投资记录扩展信息
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-11 下午2:55:22
 * 
 */
public class FundingInvestInfoExt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1023756572894197523L;

	
	/**
	 * 众筹投资记录
	 */
	public FundingInvestInfo invest;
	
	/**
	 * 众筹投资项目
	 */
	public FundingProject project;
	
	/**
	 * 众筹回报
	 */
	public FundingReward reward;
}
