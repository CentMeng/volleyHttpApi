package com.creditcloud.model;

import java.io.Serializable;

/**
 * 
 * 众筹投资相关信息
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-20 下午6:44:48
 * 
 */
public class FundingInvestInfo implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = -2204651021643565715L;

	/**
	 * same with FundingInvest
	 */
	public String id;

	/**
	 * 众筹记录
	 */
	public FundingInvest invest;

	/**
	 * 真实姓名
	 */
	public String realName;

	/**
	 * 13810002000 or 010-61112222
	 */
	public String contact;

	/**
	 * 邮箱
	 */
	public String email;

	/**
	 * 全路径:北京市海淀区西直门外大街金贸中心1627室
	 */
	public String shippingAddress;

	/**
	 * 
	 */
	public boolean needInvoice;

	/**
	 * 备注信息
	 */
	public String description;
}
