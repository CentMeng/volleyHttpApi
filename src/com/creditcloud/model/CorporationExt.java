package com.creditcloud.model;

import java.io.Serializable;

/**
 * 
 * 企业扩展信息
 *  
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 2014-10-20 下午4:42:52 
 * 
 */
public class CorporationExt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4165598208062084892L;

	/**
	 * 企业用户信息
	 */
	public Corporation corp;
	
	/**
	 * 企业信息
	 */
	public CorporationInfo info;
	
}
