package com.creditcloud.model;

import java.io.Serializable;

/**
 * 联动优势资金托管账户信息
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-18 下午3:25:29
 * 
 */
public class UmpAccount implements Serializable {

	private static final long serialVersionUID = -5212940743125866430L;

	/**
	 * 账户编号
	 */
	public String accountId;

	/**
	 * 账户名称
	 */
	public String accountName;

	/**
	 * 关联用户ID
	 */
	public String userId;

	/**
	 * 注册时间
	 */
	public String regDate;

	/**
	 * 创建时间
	 */
	public long timeCreate;
}
