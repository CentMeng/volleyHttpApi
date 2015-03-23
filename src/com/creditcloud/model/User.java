package com.creditcloud.model;

import java.io.Serializable;

/**
 * 用户信息
 * @author mengxc
 *
 */
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4848617417493351617L;
	
	/**
	 * 用户ID
	 */
	public String id;
	
	/**
	 * 平台商户代码
	 */
	public String clientCode;
	
	/**
	 * 真实姓名
	 */
	public String name;
	
	/**
	 * 登录名
	 */
	public String loginName;
	
	/**
	 * 身份证号
	 */
	public String idNumber;
	
	/**
	 * 手机号
	 */
	public String mobile;
	
	/**
	 * 邮箱
	 */
	public String email;
	
	/**
	 * 来源
	 */
	public String source;
	
	/**
	 * 平台员工ID
	 */
	public String employeeId;
	
	/**
	 * 上次修改时间
	 */
	public String lastModifiedBy;
	
	/**
	 * 上次登录日期
	 */
	public String lastLoginDate;
	
	/**
	 * 注册日期
	 */
	public String registerDate;
	
	/**
	 * 是否启用
	 */
	public boolean enabled;
	
	/**
	 * 手势密码
	 */
	public String gestureCode;
	
	/**
	 * 启用手势密码
	 */
	public boolean gestureEable=false;
	
	@Deprecated
	public String token;
	public long now;
	
	public void reset() {
		this.id = "";
		this.clientCode = "";
		this.name = "";
		this.loginName = "";
		this.idNumber = "";
		this.mobile = "";
		this.email = "";
		this.source = "";
		this.employeeId = "";
		this.lastModifiedBy = null;
		this.lastLoginDate = null;
		this.enabled = true;
		this.gestureCode = "";
		this.gestureEable = false;
		this.token = "";
		this.now = 0;
	}

}
