package com.creditcloud.model;

/**
 * 
 * 版本号
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-23 下午2:41:49
 * 
 */
public class Version {

    /**
     * 版本号
     */
	public int versionCode;

	/**
	 * 版本名称
	 */
	public String versionName;
	
	/**
	 * 链接地址
	 */
	public String url;

	/**
	 * 版本描述信息
	 */
	public String description;
	
	/**
	 * 内容
	 */
	public String content;
	
	/**
	 * 是否强制更新
	 */
	public boolean forceUpdate;
	
	/**
	 * 更新类型 0：手动 1：自动
	 */
	public int updateType;
}
