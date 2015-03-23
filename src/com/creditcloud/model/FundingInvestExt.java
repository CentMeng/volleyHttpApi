package com.creditcloud.model;

import java.io.Serializable;

/**
 * 
 * 投资记录
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-11 下午2:55:22
 * 
 */
public class FundingInvestExt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1023756572894197523L;

	/**
	 * 众筹投资记录
	 */
	public FundingInvest invest;
	
	/**
	 * 众筹项目
	 */
	public FundingProject project;
}
