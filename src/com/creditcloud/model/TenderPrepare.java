package com.creditcloud.model;

import java.io.Serializable;
import java.util.List;

/** 
 * 众筹投资前待准备信息
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 2014-10-20 下午6:41:33 
 * 
 */
public class TenderPrepare implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8047119459704748759L;

	/**
	 * 众筹标题
	 */
	public String projectTitle;
	
	/**
	 * 收货地址
	 */
	public List<ShippingAddress> addresses;
	
	/**
	 * 众筹回报
	 */
	public FundingReward reward;
}
