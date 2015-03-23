package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/** 
 * 
 * 发送手机验证码
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 2014-10-4 下午4:53:19 
 * 
 */
public class SmsCaptchaRequest extends ApiRequest {

	public SmsCaptchaRequest(String mobile) {
		super(ApiConstants.API_SMS_CAPTCHA);
		
		params.put("mobile", mobile);
	}
	
}
