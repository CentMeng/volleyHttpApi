package com.creditcloud.model;

import java.io.Serializable;

/**
 * 认证列表
 * @author mengxc
 *
 */
public class Certificates implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -373714286110764271L;

	/**
	 * 关于住址的认证
	 */
	public Certificate LOCATION;
	
	/**
	 * 关于车的认证
	 */
	public Certificate VEHICLE;
	
	/**
	 * 关于教育的认证
	 */
	public Certificate EDUCATION;
	
	/**
	 * 关于身份的认证
	 */
	public Certificate ID;
	
	/**
	 * 关于家庭的认证
	 */
	public Certificate FAMILY;
	
	/**
	 * 关于借款目的的认证
	 */
	public Certificate LOANPURPOSE;
	
	/**
	 * 关于信用报告的认证
	 */
	public Certificate CREDITREPORT;
	
	/**
	 * 关于众筹项目的认证
	 */
	public Certificate CROWDFUNDING;
	
	/**
	 * 关于担保的认证
	 */
	public Certificate GUARANTEE;
	
	/**
	 * 其他认证
	 */
	public Certificate OTHERS;
	
	/**
	 * 关于保理的认证
	 */
	public Certificate FACTORING;
	
	/**
	 * 关于职业的认证
	 */
	public Certificate CAREER;
	
	/**
	 * 关于收入的认证
	 */
	public Certificate INCOME;

	/**
	 * 关于房产的认证
	 */
	public Certificate REALESTATE;
}

