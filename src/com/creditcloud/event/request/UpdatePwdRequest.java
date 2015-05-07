package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 重置密码
 * @author meng
 *
 */
public class UpdatePwdRequest extends ApiRequest{

	public UpdatePwdRequest(String mobile,String loginName,String captcha_token,String captcha_answer) {
		super(String.format(ApiConstants.API_UPDATEPWD,captcha_token,captcha_answer));
		params.put("mobile", mobile);
		params.put("loginName", loginName);
		params.put("token", captcha_token);
		params.put("captcha", captcha_answer);
	}

}