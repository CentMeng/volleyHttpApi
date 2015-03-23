package com.creditcloud.model;

import java.io.Serializable;

/**
 * 金额
 * @author mengxc
 *
 */
public class Amount implements Serializable {

    private static final long serialVersionUID = 6478257085365798719L;
    
    /**
     * 本金
     */
    public double principal;
    
    /**
     * 利率
     */
	public double interest;
	
	/**
	 * 总额
	 */
	public double totalAmount;
	
}
