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
    private double principal;
    
    /**
     * 利率
     */
	private double interest;
	
	/**
	 * 总额
	 */
	private double totalAmount;

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
	
}
