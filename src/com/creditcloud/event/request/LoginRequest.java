package com.creditcloud.event.request;

import java.util.Map;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.api.ApiSettings;
import com.creditcloud.event.ApiRequest;

/**
 * 登录请求
 * @author mengxc （csdn@vip.163.com）
 *
 */
public class LoginRequest extends ApiRequest{
	
	/**
	 * @param mobile
	 * @param password
	 */
	public LoginRequest(String mobile,String password){
		super(ApiConstants.API_LOGIN);
		params.put("client_id", ApiSettings.CLIENT_ID);
		params.put("client_secret", ApiSettings.CLIENT_SECRET);
		params.put("grant_type", ApiSettings.GRANT_TYPE);
		params.put("username", mobile);
		params.put("password", password);
	}

}
