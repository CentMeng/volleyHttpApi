package com.creditcloud.model;

import java.io.Serializable;

public class Certificate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8801908557349683071L;

	public String id;
	
	/**
	 * 用户ID
	 */
	public String userId;
	
	/**
	 * 认证类型
	 */
	public String type;
	
	/**
	 * 认证状态
	 */
	public String status;
	
	/**
	 * 认证评估
	 */
	public Assessment assessment;
	
	/**
	 * 审核人
	 */
	public String auditor;
	
	/**
	 * 审核信息
	 */
	public String auditInfo;
	
	/**
	 * 创建时间
	 */
	public long timeCreated;
	
	/**
	 * 修改时间
	 */
	public long timeLastModified;
	
}
