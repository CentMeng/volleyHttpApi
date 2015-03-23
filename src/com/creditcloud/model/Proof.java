package com.creditcloud.model;

import java.io.Serializable;

/**
 * 认证信息
 * @author mengxc
 *
 */
public class Proof implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1762150136639196690L;
	
	/**
	 * 认证ID
	 */
	public String id;
	
	/**
	 * 相关用户
	 */
	public String userId;
	
	/**
	 * 认证类型
	 */
	public String proofType;
	
	/**
	 * 认证内容类型
	 */
	public String contentType;
	
	/**
	 * 认证内容
	 */
	public String content;
	
	/**
	 * 相关描述
	 */
	public String description;

	/**
	 * 认证信息来源
	 */
	public String source;
	
	/**
	 * 上传时间
	 */
	public long submitTime;
	
	/**
	 * 上传员工ID
	 */
	public String employee;
	
	/**
	 * 有无打码
	 */
	public boolean mosaic;
	
	/**
	 * 是否是封面
	 */
	public boolean cover;
}
