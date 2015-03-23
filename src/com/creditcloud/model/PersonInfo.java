package com.creditcloud.model;

import java.io.Serializable;

/**
 * 用户个人基本信息
 * 
 * @author mengxc
 *
 */
public class PersonInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5060837359537199052L;
	
	/**
	 * 男or女
	 */
	public boolean male;
	
	/**
	 * 生日
	 */
	public long dateOfBirth;
	
	/**
	 * 有无子女
	 */
	public boolean children;
}
