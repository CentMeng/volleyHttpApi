package com.creditcloud.model;

import java.io.Serializable;

/**
 * 
 * 众筹收货地址
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-20 下午6:39:52
 * 
 */
public class ShippingAddress implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = -6914807871965936919L;

	/**
	 * ID
	 */
	public String id;

	/**
	 * 用户ID
	 */
	public String userId;

	/**
	 * 真实姓名
	 */
	public String realName;

	/**
	 * 联系方式
	 */
	public String contact;

	/**
	 * 邮箱
	 */
	public String email;

	/**
	 * 北京西城区二环到三环西直门外大街金贸中心A座1627室</p> 全称或json结构化
	 * 
	 */
	public String detail;

	/**
	 * 是否是默认收货地址
	 */
	public boolean defaultAddress;

	// 公司地址，老家地址
	public String alias;

}
