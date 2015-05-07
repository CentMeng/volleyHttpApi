package com.creditcloud.model;

import java.io.Serializable;

/**
 * 资金账户
 * @author mengxc
 *
 */
public class FundAccount implements Serializable {

    private static final long serialVersionUID = -8825708930588566995L;

    private String id;
	
	private String category;
	
	/**
	 * 用户ID
	 */
	private String userId;
	
	/**
	 * 是否已经验证通过
	 */
	private boolean valid;
	
	/**
	 * 是否为首选默认银行账号,充值提现时将显示在第一个
	 */
	private boolean defaultAccount;
	
	/**
	 * 创建时间
	 */
	private long timeRecorded;
	
	/**
	 * 银行账号
	 */
	private BankAccount account;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isDefaultAccount() {
		return defaultAccount;
	}

	public void setDefaultAccount(boolean defaultAccount) {
		this.defaultAccount = defaultAccount;
	}

	public long getTimeRecorded() {
		return timeRecorded;
	}

	public void setTimeRecorded(long timeRecorded) {
		this.timeRecorded = timeRecorded;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	
	
}
