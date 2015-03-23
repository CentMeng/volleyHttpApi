package com.creditcloud.model;

import java.io.Serializable;

/** 
 * 企业信息
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 2014-10-20 下午4:42:52 
 * 
 */
public class Corporation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4875463750292095156L;

	/**
	 * 企业用户
	 */
	public User user;
	
	/**
	 * 法人ID
	 */
	public String legalPersonId;
	
	/**
	 * 真实姓名
	 */
	public String name;
	
	/**
	 * 企业简称
	 */
	public String shortName;
	
	/**
	 * 组织机构代码
	 */
	public String orgCode;
	
	/**
	 * 营业执照编号
	 */
	public String busiCode;
	
	/**
	 * 税务登记号
	 */
	public String taxCode;
	
	public String type;
	
	/**
	 * 营业执照上的公司类型
	 */
	public String category;
	
	/**
	 * 注册日期
	 */
	public long registerDate;
	
	/**
	 * 登录名
	 */
	public String loginName;
	
}
