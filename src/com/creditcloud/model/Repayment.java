package com.creditcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 标的还款记录
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-13 下午2:09:56
 * 
 */
public class Repayment implements Serializable {

	private static final long serialVersionUID = 6149652723679320799L;

	/**
	 * 本金
	 */
	private double amountPrincipal;

	/**
	 * 利息
	 */
	private double amountInterest;

	/**
	 * 总金额
	 */
	private double amountOutstanding;

	/**
	 * 还款时间
	 */
	private String dueDate;

//	public Repayment() {
//	}
//
//	public Repayment(BigDecimal amountPrincipal, BigDecimal amountInterest,
//			BigDecimal amountOutstanding, Date dueDate) {
//		this.amountPrincipal = amountPrincipal.doubleValue();
//		this.amountInterest = amountInterest.doubleValue();
//		this.amountOutstanding = amountOutstanding.doubleValue();
//		this.dueDate = dueDate.getTime();
//	}

	/**
	 * 当期的应还款总额.
	 * 
	 * amountPrincipal + amountInterest
	 * 
	 * @return
	 */
	public double getAmount() {
		return amountInterest + amountPrincipal;
	}

	public double getAmountPrincipal() {
		return amountPrincipal;
	}

	public void setAmountPrincipal(double amountPrincipal) {
		this.amountPrincipal = amountPrincipal;
	}

	public double getAmountInterest() {
		return amountInterest;
	}

	public void setAmountInterest(double amountInterest) {
		this.amountInterest = amountInterest;
	}

	public double getAmountOutstanding() {
		return amountOutstanding;
	}

	public void setAmountOutstanding(double amountOutstanding) {
		this.amountOutstanding = amountOutstanding;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
}
