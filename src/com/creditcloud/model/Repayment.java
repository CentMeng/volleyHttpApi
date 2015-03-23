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
	public double amountPrincipal;

	/**
	 * 利息
	 */
	public double amountInterest;

	/**
	 * 总金额
	 */
	public double amountOutstanding;

	/**
	 * 还款时间
	 */
	public long dueDate;

	public Repayment() {
	}

	public Repayment(BigDecimal amountPrincipal, BigDecimal amountInterest,
			BigDecimal amountOutstanding, Date dueDate) {
		this.amountPrincipal = amountPrincipal.doubleValue();
		this.amountInterest = amountInterest.doubleValue();
		this.amountOutstanding = amountOutstanding.doubleValue();
		this.dueDate = dueDate.getTime();
	}

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
}
