package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

public class SmsCaptchaRequest1 extends ApiRequest {

	public SmsCaptchaRequest1(String userId,String type) {
		super(String.format(ApiConstants.API_SMS_CAPTCHA1, userId));
		params.put("smsType", type);
	}

	
}

