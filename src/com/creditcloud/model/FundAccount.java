package com.creditcloud.model;

import java.io.Serializable;

/**
 * 资金账户
 * @author mengxc
 *
 */
public class FundAccount implements Serializable {

    private static final long serialVersionUID = -8825708930588566995L;

    public String id;
	
	public String category;
	
	/**
	 * 用户ID
	 */
	public String userId;
	
	/**
	 * 是否已经验证通过
	 */
	public boolean valid;
	
	/**
	 * 是否为首选默认银行账号,充值提现时将显示在第一个
	 */
	public boolean defaultAccount;
	
	/**
	 * 创建时间
	 */
	public long timeRecorded;
	
	/**
	 * 银行账号
	 */
	public BankAccount account;
	
}
