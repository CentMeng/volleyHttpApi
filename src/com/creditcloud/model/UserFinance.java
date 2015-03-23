package com.creditcloud.model;

import java.io.Serializable;

/**
 * 用户经济状况
 * 
 * @author mengxc
 *
 */
public class UserFinance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4222963670378630772L;

	/**
	 * 是否有房
	 */
	public boolean house;
	
	/**
	 * 房子总数
	 */
	public long houseNumber;
	
	/**
	 * 是否有房贷
	 */
	public boolean houseLoan;
	
	/**
	 * 是否有车
	 */
	public boolean car;
	
	/**
	 * 车数
	 */
	public long carNumber;
	
	/**
	 * 是否有车贷
	 */
	public boolean carLoan;
	
}
