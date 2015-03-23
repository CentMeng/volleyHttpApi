package com.creditcloud.model;

/**
 * 用户认证信息
 * @author mengxc
 *
 */
public class UserAuthenticate {

    /**
     * 用户ID
     */
	public String userId;
	
	/**
	 * 手机认证
	 */
	public boolean mobileAuthenticated;
	
	/**
	 * 邮箱认证
	 */
	public boolean emailAuthenticated;
	
	/**
	 * 身份证认证
	 */
	public boolean idauthenticated;
	
	/**
	 * 微信认证
	 */
	public boolean wechatAuthenticated;
	
	/**
	 * 微博认证
	 */
	public boolean weiboAuthenticated;
	
}
