package com.creditcloud.model;

import java.io.Serializable;

/**
 * 借款标的周期
 * 
 * Created by mengxc on 14-3-4.
 */
public class Duration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8381015081513342833L;

	/**
	 * 年
	 */
	public int years;
	
	/**
	 * 月
	 */
	public int months;
	
	/**
	 * 天
	 */
	public int days;
	
	/**
	 * 总月数
	 */
	public int totalMonths;
	
	/**
	 * 总天数
	 */
	public int totalDays;

	public String getTotalMonth() {
		int month = 0;
		if (years > 0) {
			month += years * 12;
		}

		if (months > 0) {
			month += months;
		}
		return String.valueOf(month);
	}

	public int getTotalMonths() {
		return years * 12 + months;
	}
	
	public Duration() {}
	
	public Duration(final int years, final int months, final int days) {
		this.years = years;
		this.months = months;
		this.days = days;
	}
}
