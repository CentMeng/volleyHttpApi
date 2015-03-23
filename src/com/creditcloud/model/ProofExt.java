package com.creditcloud.model;

import java.io.Serializable;

/**
 * 认证扩展信息
 * 
 * Created by mengxc on 14-3-4.
 */
public class ProofExt implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1487649890929356837L;
	
	/**
	 * 认证基本信息
	 */
	public Proof proof;
	
	/**
	 * 认证URI
	 */
	public String uri;
	
	/**
	 * 上传人
	 */
	public String uploader;
	
	/**
	 * 上传用户ID
	 */
	public String uploaderId;
	
	/**
	 * 提交时间
	 */
	public long submitTime;
	
	/**
	 * 认证类型
	 */
	public String proofType;
	
	/**
	 * ID
	 */
	public String id;
	
	/**
	 * 内容
	 */
	public String content;
	
	/**
	 * 来源
	 */
	public String source;
	
	@Deprecated
	public String src;
}
