package com.creditcloud.model;

import java.io.Serializable;

/**
 * 银行账户
 * @author mengxc
 *
 */
public class BankAccount implements Serializable {

	/**
     * 
     */
    private static final long serialVersionUID = -2887229257406845848L;

    /**
     * 账户名
     */
    public String name;
	
    /**
     * 银行类型
     */
	public String bank;
	
	/**
	 * 开户行地址
	 */
	public String location;
	
	/**
	 * 支行名称
	 */
	public String branch;
	
	/**
	 * 账户卡号
	 */
	public String account;
}
